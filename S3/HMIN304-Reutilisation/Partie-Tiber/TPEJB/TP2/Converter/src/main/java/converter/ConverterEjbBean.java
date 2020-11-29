package converter;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
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

    public ConverterEjbBean() {
        SAXBuilder sxb = new SAXBuilder();
        URL url;

        try{
            url = new URL("https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml");
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            Document document = sxb.build(con.getInputStream());
            Element racine = document.getRootElement();
            Namespace ns = Namespace.getNamespace("http://www.ecb.int/vocabulary/2002-08-01/eurofxref");
            Element elem = racine.getChild("Cube", ns);//<Cube>
            elem = elem.getChild("Cube",ns);//<Cube time>
            List<Element> listeCube = elem.getChildren("Cube", ns);//<Cube currency>
            for(Element e : listeCube) {
                Monnaie monnaie = new Monnaie();
                monnaie.code = e.getAttributeValue("currency");
                monnaie.taux = Float.parseFloat(e.getAttributeValue("rate"));
                currencies.add(monnaie);
            }
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch (JDOMException e) {
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
                        monnaie.nom.add(elem.getChildText("Ccy"));
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
            url = new URL("https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml");
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            Document document = sxb.build(con.getInputStream());
            Element racine = document.getRootElement();
            Namespace ns = Namespace.getNamespace("http://www.ecb.int/vocabulary/2002-08-01/eurofxref");
            Element elem = racine.getChild("Cube", ns);//<Cube>
            elem = elem.getChild("Cube",ns);//<Cube time>
            List<Element> listeCube = elem.getChildren("Cube", ns);//<Cube currency>
            for(Element e : listeCube) {
                String currency_temp = e.getAttributeValue("currency");
                if(currency_temp.equals(currencyCode)) {
                    double rate = Double.parseDouble(e.getAttributeValue("rate"));
                    return amount * rate;
                }
            }
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch (JDOMException e) {
            e.printStackTrace();
        }
        return -1;//not found
    }

    @Override
    public List<Monnaie> getAvailableCurrencies() {
        return currencies;
    }
}
