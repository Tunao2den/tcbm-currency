package com.tcbmcurrency.tcbmcurrency.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JacksonXmlRootElement(localName = "Tarih_Date")
public class ExchangeDates {
    @JacksonXmlProperty(localName = "Tarih", isAttribute = true)
    private String tarih;
    @JacksonXmlProperty(localName = "Date", isAttribute = true)
    private String date;
    @JacksonXmlProperty(localName = "Bulten_No", isAttribute = true)
    private String bultenNo;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "Currency")
    private List<CurrencyInfo> currencyInfos = new ArrayList<>();
}
