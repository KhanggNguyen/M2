package MDB;

import converter.IConverter;
import converter.Monnaie;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.mail.*;
import javax.jms.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.*;


@MessageDriven(activationConfig = {
        @ActivationConfigProperty(
                propertyName = "destination",
                propertyValue = "queue/MailContent"
        ),
        @ActivationConfigProperty(
                propertyName = "destinationType",
                propertyValue = "javax.jms.Queue"
        )
})
public class MailerMDBBean implements MessageListener {
    @EJB
    IConverter converter;

    public MailerMDBBean() {
    }

    @Override
    public void onMessage(Message message) {
        try{
            if(message instanceof TextMessage){
                TextMessage msge = (TextMessage) message;
                String content = msge.getText();
                //Récuperer le montant à convertir
                String s = content.substring(0, content.indexOf("#"));
                double amount = Double.parseDouble(s);
                //Demande au bean session de faire toutes les conversions
                Map<Monnaie, Double> map = converter.euroToOtherCurrency(amount);
                Properties p = new Properties();
                p.put("mail.smtp.host", "smtp.gmail.com");
                p.put("mail.smtp.port", 587);
                p.put("mail.smtp.auth", "true");
                p.put("mail.smtp.starttls.enable", "true");
                javax.mail.Session session = javax.mail.Session.getInstance(p);
                javax.mail.Message msg = new MimeMessage(session);
                try{
                    msg.setFrom(new InternetAddress(System.getenv("MailTest")));
                    String dest = content.substring(content.indexOf("#")+1);
                    msg.setRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(dest));
                    String sujet = "Conversions de monnaie";
                    msg.setSubject(sujet);
                    String table_conversion = "";
                    content += "<table border='1' style='border-collapse:collapse'>" +
                            "<tr>" +
                            "<th>Currency</th>" +
                            "<th>Actual Rate</th>" +
                            "<th>Converted Amount</th>" +
                            "</tr>";
                    if(map != null){
                        for(Map.Entry<Monnaie, Double> entry : map.entrySet()){
                            content += "<tr>";
                            content += "<td>" + entry.getKey().code + "(" + entry.getKey().nomComplet + ")</td>";
                            content += "<td>" + entry.getKey().taux + "</td>";
                            content += "<td>" + entry.getValue() + "</td>";
                            content += "</tr>";
                        }
                    }

                    content += "</table>";

                    msg.setContent(content, "text/html;charset=utf8");
                    msg.setSentDate(Calendar.getInstance().getTime());
                    //Préparation de l'envoi du mail
                    Transport transport = session.getTransport("smtp");
                    transport.connect("smtp.gmail.com", 587, System.getenv("MailTest"), System.getenv("MdpMailTest"));
                    //Envoi du mail
                    transport.sendMessage(msg,msg.getAllRecipients());
                    transport.close();
                    System.out.println("Mail envoyé à " + dest);
                }catch(MessagingException e){
                    e.printStackTrace();
                }
            }
        }catch(JMSException ex){
            ex.printStackTrace();
        }
    }
}
