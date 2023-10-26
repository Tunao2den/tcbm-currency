package com.tcbmcurrency.tcbmcurrency.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.tcbmcurrency.tcbmcurrency.model.CurrencyInfo;
import com.tcbmcurrency.tcbmcurrency.model.ExchangeDates;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XmlToObjectMapper {
    @SneakyThrows
    public ExchangeDates xmlToObject(String xmlData) {
//        File xmlFile = new File("test1.xml"); // Replace with the path to your XML file.

        XmlMapper xmlMapper = new XmlMapper();
        ExchangeDates exchangeDates = xmlMapper.readValue(xmlData, ExchangeDates.class);
        return exchangeDates;
    }
}
