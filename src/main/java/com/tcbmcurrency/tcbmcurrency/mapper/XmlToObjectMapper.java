package com.tcbmcurrency.tcbmcurrency.mapper;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.tcbmcurrency.tcbmcurrency.model.data.ExchangeDates;
import lombok.SneakyThrows;

public class XmlToObjectMapper {
    @SneakyThrows
    public ExchangeDates xmlToObject(String xmlData) {
//        File xmlFile = new File("test1.xml"); // Replace with the path to your XML file.

        XmlMapper xmlMapper = new XmlMapper();
        ExchangeDates exchangeDates = xmlMapper.readValue(xmlData, ExchangeDates.class);
        return exchangeDates;
    }
}
