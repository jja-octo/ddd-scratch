package com.octo.bank;

import java.util.Currency;

public class Bank {
    MoneyExchangePlatform mep;

    public Bank(MoneyExchangePlatform mep) {
        this.mep = mep;
    }
    
    public Money convert(Money currentMonney, Currency targetCurrency) {
         ConversionRate rate = mep.fetchConversionRate(currentMonney.currency(), targetCurrency);
         return new Money(rate.applyTo(currentMonney.amount()), targetCurrency); 
    }
}
