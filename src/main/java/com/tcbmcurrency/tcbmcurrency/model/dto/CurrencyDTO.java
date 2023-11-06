package com.tcbmcurrency.tcbmcurrency.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyDTO {
    private int crossOrder;
    private String date;
    private String currencyCode;
    private String unit;
    private String currencyName;
    private double forexBuying;
    private double forexSelling;
    private double banknoteBuying;
    private double banknoteSelling;
}
