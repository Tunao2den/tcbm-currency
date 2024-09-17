package com.tuna.tcmbcurrency.model.table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CurrencyTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cross_order")
    private Integer crossOrder;
    @Column(name = "date")
    private String date;
    @Column(name = "currency_code")
    private String currencyCode;
    @Column(name = "unit")
    private String unit;
    @Column(name = "currency_name")
    private String currencyName;
    @Column(name = "forex_buying")
    private double forexBuying;
    @Column(name = "forex_selling")
    private double forexSelling;
    @Column(name = "banknot_buying")
    private double banknoteBuying;
    @Column(name = "banknote_selling")
    private double banknoteSelling;
}
