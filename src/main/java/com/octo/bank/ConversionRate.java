package com.octo.bank;

import java.math.BigDecimal;
import java.util.Currency;

public class ConversionRate {
    private BigDecimal value;
    private Currency targetCurrency;

    public ConversionRate(BigDecimal value) {
        this.value = value;
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
}
