package com.octo.bank;

import java.util.Currency;

// @Repository
public class RateRestRepository implements MoneyExchangePlatform {
    @Override
    public ConversionRate fetchConversionRate(Currency currency, Currency targetCurrency) {
        //"http.get ......"
        throw new UnsupportedOperationException("not implemented yet");
    }
}
