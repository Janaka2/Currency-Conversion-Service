import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize exchange rates
        Map<String, ExchangeRate> exchangeRates = new HashMap<>();
        exchangeRates.put("USD_EUR", new ExchangeRate("USD", "EUR", 0.85));
        exchangeRates.put("EUR_USD", new ExchangeRate("EUR", "USD", 1.18));

        // Create a currency converter
        CurrencyConverter converter = new CurrencyConverter(exchangeRates);

        // Perform conversions
        double eurToUsd = converter.convert("EUR", "USD", 100);
        double usdToEur = converter.convert("USD", "EUR", 100);

        System.out.println("100 EUR to USD: " + eurToUsd);
        System.out.println("100 USD to EUR: " + usdToEur);
    }
}
