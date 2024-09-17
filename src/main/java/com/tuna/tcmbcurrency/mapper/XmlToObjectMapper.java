package com.tuna.tcmbcurrency.mapper;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.tuna.tcmbcurrency.model.data.ExchangeDates;
import lombok.SneakyThrows;

public class XmlToObjectMapper {
    @SneakyThrows
    public ExchangeDates xmlToObject(String xmlData) {

        XmlMapper xmlMapper = new XmlMapper();
        ExchangeDates exchangeDates = xmlMapper.readValue(xmlData, ExchangeDates.class);
        return exchangeDates;
    }
}
