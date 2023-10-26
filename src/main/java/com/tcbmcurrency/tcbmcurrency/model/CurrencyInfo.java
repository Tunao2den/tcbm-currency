package com.tcbmcurrency.tcbmcurrency.model;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CurrencyInfo {
    @JacksonXmlProperty(localName = "CrossOrder", isAttribute = true)
    private int crossOrder;

    @JacksonXmlProperty(localName = "Kod", isAttribute = true)
    private String kod;

    @JacksonXmlProperty(localName = "CurrencyCode", isAttribute = true)
    private String currencyCode;

    @JacksonXmlProperty(localName = "Unit")
    private String unit;

    @JacksonXmlProperty(localName = "Isim")
    private String isim;

    @JacksonXmlProperty(localName = "CurrencyName")
    private String currencyName;

    @JacksonXmlProperty(localName = "ForexBuying")
    private double forexBuying;

    @JacksonXmlProperty(localName = "ForexSelling")
    private double forexSelling;

    @JacksonXmlProperty(localName = "BanknoteBuying")
    private double banknoteBuying;

    @JacksonXmlProperty(localName = "BanknoteSelling")
    private double banknoteSelling;

    @JacksonXmlProperty(localName = "CrossRateUSD")
    private String crossRateUSD;

    @JacksonXmlProperty(localName = "CrossRateOther")
    private String crossRateOther;
}