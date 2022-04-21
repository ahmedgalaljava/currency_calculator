package com.currency.model;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * The Currency Entity represent the currency_rate table.
 */
@javax.persistence.Entity(name = "currency_rate")
public class CurrencyRate implements Serializable {
    @Id
    private int id ;
    // The source currency.

    private String from;
    //The target currency.
    private String to;
    // The rate modification date.
    private Date modification_date;
    // The rate value .
    private BigDecimal value;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getModification_date() {
        return modification_date;
    }

    public void setModification_date(Date modification_date) {
        this.modification_date = modification_date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "id=" + id +
                ", from_currency='" + from + '\'' +
                ", to_currency='" + to + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
