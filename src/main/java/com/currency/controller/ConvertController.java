package com.currency.controller;

import com.currency.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;

/**
 * The Convert Controller
 */
@RestController
@RequestMapping("/api/")
public class ConvertController {
    @Autowired
    CurrencyService  currencyService;

    /**
     *
     * @param from represent the source currency.
     * @param to   represent the target currency.
     * @param amount
     * @return calculatedValue.
     */

    @GetMapping("/calculate/{from}/{to}/{amount}")
    public BigDecimal getConvertValue(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal amount)  {
        BigDecimal calculatedValue=currencyService.convertCalculator(from , to, amount);
        return calculatedValue;
    }
}
