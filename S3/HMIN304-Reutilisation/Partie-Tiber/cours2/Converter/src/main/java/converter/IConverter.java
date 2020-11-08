package converter;

import javax.ejb.Remote;
import java.util.List;
import java.util.Map;

@Remote
public interface IConverter {

    public Map<Monnaie, Double> euroToOtherCurrency(double amount);
    public double euroToOtherCurrency(double amount, String currencyCode);
    public List<Monnaie> getAvailableCurrencies();
}
