package converter;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Remote(IConverter.class)
@Stateless(name = "ConverterEjbEJB")
public class ConverterEjbBean implements IConverter{
    public ConverterEjbBean() {
    }

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
}
