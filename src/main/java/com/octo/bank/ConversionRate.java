package com.octo.bank;

import java.math.BigDecimal;

public class ConversionRate {
    private BigDecimal value;

    public ConversionRate(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal value() {
        return value;
    }

    public BigDecimal applyTo(BigDecimal amount) {
        return value.multiply(amount);
    }
}
