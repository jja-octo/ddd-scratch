package com.octo.bank;

import java.util.Currency;

public class Bank {
    MoneyExchangePlatform mep;

    public Bank(MoneyExchangePlatform mep) {
        this.mep = mep;
    }
    
    public Money convert(Money currentMoney, Currency targetCurrency) {
         ConversionRate rate = mep.fetchConversionRate(currentMoney.currency(), targetCurrency);
         return rate.convert(currentMoney); 
    }
}
