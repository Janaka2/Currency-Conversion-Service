public final class ExchangeRate {
    private final String sourceCurrency;
    private final String targetCurrency;
    private final double rate;

    public ExchangeRate(String sourceCurrency, String targetCurrency, double rate) {
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.rate = rate;
    }

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public double getRate() {
        return rate;
    }
}
