package com.octo.bank;

import java.util.Currency;

public interface MoneyExchangePlatform {
    ConversionRate fetchConversionRate(Currency currency, Currency targetCurrency);
}
