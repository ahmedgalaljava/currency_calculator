package com.currency.repository;

import com.currency.model.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Currency Rate Repository
 */
@Repository
public interface CurrencyRateRepository extends  JpaRepository<CurrencyRate, Long> {
    /**
     *
      * @param from_currency represent the source currency.
     * @param to_currency represent the target currency.
     * @return The method return the exchange rate.
     */

    public CurrencyRate findByFromAndTo(String from_currency,String to_currency);

}

