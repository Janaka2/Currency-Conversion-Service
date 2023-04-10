# Currency-Conversion-Service
# Immutable Currency Conversion Service

This Java project demonstrates the use of immutability in the context of a currency conversion service. The service converts amounts between different currencies using fixed exchange rates, which remain constant throughout the service's lifecycle.

## Classes

1. **ExchangeRate**: An immutable class that represents the exchange rate between two currencies.

2. **CurrencyConverter**: A class that uses the `ExchangeRate` class to perform currency conversions.

3. **Main**: A sample class that demonstrates the usage of the `CurrencyConverter`.

## Usage

Initialize exchange rates and create a `CurrencyConverter` instance:

```java
Map<String, ExchangeRate> exchangeRates = new HashMap<>();
exchangeRates.put("USD_EUR", new ExchangeRate("USD", "EUR", 0.85));
exchangeRates.put("EUR_USD", new ExchangeRate("EUR", "USD", 1.18));

CurrencyConverter converter = new CurrencyConverter(exchangeRates);

```

````java
Perform currency conversions:
double eurToUsd = converter.convert("EUR", "USD", 100);
double usdToEur = converter.convert("USD", "EUR", 100);


```

## Benefits of Immutability
- Simplified reasoning: Immutable objects are easier to reason about, understand, and debug, as they do not have side effects.
- Thread safety: Immutable objects are inherently thread-safe, as they can be safely shared across multiple threads without the need for synchronization or locks.
- Reduced risk of bugs: Immutable objects help reduce the risk of bugs caused by unintentional object modification, ensuring that the object's state remains consistent throughout its lifecycle.
- Improved performance: Immutability can lead to better performance by enabling optimizations such as caching and memoization, as well as reducing the need for defensive copying.


## License
This project is released under the MIT License.
