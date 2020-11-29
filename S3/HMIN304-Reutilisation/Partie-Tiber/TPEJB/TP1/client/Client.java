import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.util.Scanner;
import converter.IConverter;

public class Client {
    public static void main(String[] args) {
        try {
            Object obj =  InitialContext.doLookup("Converter-1.0-SNAPSHOT/ConverterEjbEJB!converter.IConverter");
            IConverter converter = (IConverter) obj;
            double amount = -1, newAmount = 0;
            String type = "";
            Scanner scan = new Scanner(System.in);

            System.out.print("Saississez le montant souhaité à convertir : ");
            amount = scan.nextDouble();

            System.out.print("Saississez le type de monnaie à convertir suivant (USD, JPY): ");
            type = scan.next();

            switch (type) {
                case "USD":
                    System.out.println("Type de monnaie à convertir est " + type);
                    newAmount = converter.euroToOtherCurrency(amount, type);
                    break;
                case "JPY":
                    System.out.println("Type de monnaie à convertir est " + type);
                    newAmount = converter.euroToOtherCurrency(amount, type);
                    break;
                default:
                    System.out.println("Le type choisi n'est pas valid");
                    break;
            }

            System.out.println("Nouveau montant : " + newAmount);
        } catch (NamingException e) {
            System.err.println(e);
        }

    }
}