import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.util.Scanner;
import converter.IConverter;

public class Client {
    public static void main(String[] args) {
        try {
            Object obj =  InitialContext.doLookup("Converter-1.0-SNAPSHOT/ConverterEjbEJB!converter.IConverter");
            IConverter converter = (IConverter) obj;
            double montant = -1, nouveauMontant = 0;
            String type = "";
            Scanner scan = new Scanner(System.in);

            System.out.print("Saississez le montant souhaité à convertir en USD: ");
            amount = scan.nextDouble();

            nouveauMontant = converter.euroToOtherCurrency(montant, "USD");

            System.out.println("Nouveau montant : " + nouveauMontant);
        } catch (NamingException e) {
            System.err.println(e);
        }

    }
}