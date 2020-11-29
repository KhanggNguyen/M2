package converter;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import persistence.DAOFactory;
import persistence.DAOMonnaie;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Remote(IConverter.class)
@Stateful(name = "ConverterEjbEJB")
public class ConverterEjbBean implements IConverter{
    private List<Monnaie> currencies = new ArrayList<Monnaie>();
    private DAOMonnaie daoMonnaie;
    public ConverterEjbBean() {
        daoMonnaie = DAOFactory.getInstance().getDaoMonnaie();
        SAXBuilder sxb = new SAXBuilder();
        URL url;

        try{
            url = new URL("http://currencies.apps.grandtrunk.net/currencies");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while((inputLine = in.readLine()) != null){
                Monnaie monnaie = new Monnaie();
                monnaie.code = inputLine;

                try {
                    url = new URL("http://currencies.apps.grandtrunk.net/getlatest/" + "EUR" + "/" + inputLine);
                    BufferedReader in2 = new BufferedReader(new InputStreamReader(url.openStream()));
                    monnaie.taux = Float.parseFloat(in2.readLine());
                }catch(MalformedURLException ex){
                    ex.printStackTrace();
                }catch(IOException ex){
                    System.err.println(ex);
                    monnaie.taux = -1;
                }

                currencies.add(monnaie);
            }
            in.close();
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            url = new URL("https://www.currency-iso.org/dam/downloads/lists/list_one.xml");
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            Document document = sxb.build(con.getInputStream());
            Element racine = document.getRootElement();
            Element element = racine.getChild("CcyTbl");
            List<Element> liste = element.getChildren("CcyNtry");
            for(Element elem : liste) {
                for(Monnaie monnaie : currencies){
                    if(monnaie.code.equals(elem.getChildText("Ccy"))){
                        monnaie.nom.add(elem.getChildText("CtryNm"));
                        monnaie.nomComplet = elem.getChildText("CcyNm");
                    }
                }
            }
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch (JDOMException e) {
            e.printStackTrace();
        }

        for(Monnaie monnaie : currencies)
            daoMonnaie.addMonnaie(monnaie);
    }

    @Override
    public Map<Monnaie, Double> euroToOtherCurrency(double amount) {
        Map<Monnaie, Double> map = new HashMap<>();
        for(Monnaie monnaie : currencies){
            Double newAmount = euroToOtherCurrency(amount, monnaie.code);
            map.put(monnaie, newAmount);
        }
        return map;
    }

    @Override
    public double euroToOtherCurrency(double amount, String currencyCode){
        SAXBuilder sxb = new SAXBuilder();
        URL url;
        try{
            url = new URL("http://currencies.apps.grandtrunk.net/getlatest/" + "EUR" + "/" + currencyCode);
            BufferedReader in2 = new BufferedReader(new InputStreamReader(url.openStream()));
            float taux = Float.parseFloat(in2.readLine());

            if(taux > 0 ) {
                return amount * taux;
            }

        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            System.err.println(e);
        }
        return -1;//not found
    }

    @Override
    public List<Monnaie> getAvailableCurrencies() {
        return currencies;
    }
}
