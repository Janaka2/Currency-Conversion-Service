import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private final Map<String, ExchangeRate> exchangeRates;

    public CurrencyConverter(Map<String, ExchangeRate> exchangeRates) {
        this.exchangeRates = new HashMap<>(exchangeRates);
    }

    public double convert(String sourceCurrency, String targetCurrency, double amount) {
        String key = sourceCurrency + "_" + targetCurrency;
        ExchangeRate exchangeRate = exchangeRates.get(key);

        if (exchangeRate == null) {
            throw new IllegalArgumentException("No exchange rate found for the given currencies");
        }

        return amount * exchangeRate.getRate();
    }
}
