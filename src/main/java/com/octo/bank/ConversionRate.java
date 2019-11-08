package com.octo.bank;

import java.math.BigDecimal;
import java.util.Currency;

public class ConversionRate {
    private Currency sourceCurrency;
    private Currency targetCurrency;
    private BigDecimal value;

    public ConversionRate(Currency sourceCurrency, Currency targetCurrency, BigDecimal value) {
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.value = value;
    }

    public static ConversionRateBuilder from(Currency currency) {
        return new ConversionRateBuilder().addFromCurrency(currency);
    }

    public BigDecimal value() {
        return value;
    }

    public Money convert(Money currentMonney) {
        checkCurrencyCosntraints();

        return new Money(applyTo(currentMonney.amount()), this.targetCurrency);
    }

    private void checkCurrencyCosntraints() {
        // TODO
    }

    private BigDecimal applyTo(BigDecimal amount) {
        return value.multiply(amount);
    }

    public static class ConversionRateBuilder { // TODO use an immutable style or not?
        private Currency fromCurrency;
        private Currency toCurrency;

        public ConversionRateBuilder addFromCurrency(Currency currency) {
            this.fromCurrency = currency;
            return this;
        }

        public ConversionRateBuilder to(Currency instance) {
            this.toCurrency = fromCurrency;
            return this;
        }

        public ConversionRate value(BigDecimal rate) {
            return new ConversionRate(fromCurrency, toCurrency, rate);
        }
    }
}
