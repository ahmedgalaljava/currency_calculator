package com.currency.service;

import com.currency.model.CurrencyRate;
import com.currency.repository.CurrencyRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CurrencyService {
    @Autowired
    private CurrencyRateRepository currencyRateRepository;

    /**
     *
     * @param from_currency represent the source currency.
     * @param to_currency represent the target currency.
     * @return The method converted amount.
     */
    public BigDecimal convertCalculator(String from_currency , String to_currency,BigDecimal amount) {
        CurrencyRate currencyRate = currencyRateRepository.findByFromAndTo(from_currency, to_currency);
        BigDecimal calculatedAmountValue = new BigDecimal(currencyRate.getValue().toString()).multiply(amount) ;
        return  calculatedAmountValue;
    }
}
