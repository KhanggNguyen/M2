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
    public ConverterEjbBean() throws IOException, JDOMException{
        daoMonnaie = DAOFactory.getInstance().getDaoMonnaie();

        SAXBuilder sxb = new SAXBuilder();
        readXml();
        readXml(sxb);

        for(Monnaie monnaie : currencies)
            daoMonnaie.addMonnaie(monnaie);
    }

    /**
     * Initialiser Code et Taux pour les objets Monnaie dans la liste currencies
     * @throws IOException
     */
    private void readXml() throws IOException {
        URL url;
        url = new URL("http://currencies.apps.grandtrunk.net/currencies");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String inputLine;
        while((inputLine = in.readLine()) != null){
            Monnaie monnaie = new Monnaie();
            monnaie.setCode(inputLine);

            try {
                url = new URL("http://currencies.apps.grandtrunk.net/getlatest/" + "EUR" + "/" + inputLine);
                BufferedReader in2 = new BufferedReader(new InputStreamReader(url.openStream()));
                monnaie.setTaux(Float.parseFloat(in2.readLine()));
            }catch(MalformedURLException ex){
                ex.printStackTrace();
            }catch(IOException ex){
                System.err.println(ex);
                monnaie.setTaux(-1.0f);
            }

            currencies.add(monnaie);
        }
        in.close();
    }

    /**
     * Initialiser Nom complet et
     * ajouter les pays dans la liste des pays pour chaque objet Monnaie
     *
     * @param sxb
     * @throws IOException
     * @throws JDOMException
     */
    private void readXml(SAXBuilder sxb) throws IOException, JDOMException {
        URL url;
        url = new URL("https://www.currency-iso.org/dam/downloads/lists/list_one.xml");
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        Document document = sxb.build(con.getInputStream());
        Element racine = document.getRootElement();
        Element element = racine.getChild("CcyTbl");
        List<Element> liste = element.getChildren("CcyNtry");
        for(Element elem : liste) {
            for(Monnaie monnaie : currencies){
                if(monnaie.getCode().equals(elem.getChildText("Ccy"))){
                    monnaie.pays.add(elem.getChildText("CtryNm"));
                    monnaie.setNom(elem.getChildText("CcyNm"));
                }
            }
        }
    }

    /**
     * Convertir un montant vers tous les autres type
     * Les stocker dans un Map de type Map<Monnaie, Double>
     * et renvoyer cette Map
     *
     * @param amount
     * @return
     */
    @Override
    public Map<Monnaie, Double> euroToOtherCurrency(double amount) {
        Map<Monnaie, Double> map = new HashMap<>();
        for(Monnaie monnaie : currencies){
            Double newAmount = euroToOtherCurrency(amount, monnaie.getCode());
            map.put(monnaie, newAmount);
        }
        return map;
    }

    /**
     * Convertir un montant vers un autre type ciblé dans paramètre
     *
     * @param amount
     * @param currencyCode
     * @return
     */
    @Override
    public double euroToOtherCurrency(double amount, String currencyCode){
        try{
            URL url = new URL("http://currencies.apps.grandtrunk.net/getlatest/" + "EUR" + "/" + currencyCode);
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

    /**
     * Renvoyer la liste des currencies
     * @return List<Monnaie>
     */
    @Override
    public List<Monnaie> getAvailableCurrencies() {
        return currencies;
    }
}
