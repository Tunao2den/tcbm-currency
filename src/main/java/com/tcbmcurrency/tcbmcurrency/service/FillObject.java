package com.tcbmcurrency.tcbmcurrency.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tcbmcurrency.tcbmcurrency.mapper.XmlToObjectMapper;
import com.tcbmcurrency.tcbmcurrency.model.ExchangeDates;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

public class FillObject {

    @Autowired
    private TcbmService tcbmService;

    public ExchangeDates printMap() throws JsonProcessingException {
        XmlToObjectMapper xmlToObjectMapper = new XmlToObjectMapper();

        String xmlData = tcbmService.getDataFromTcbm().toString();
        ExchangeDates exchangeDates = xmlToObjectMapper.xmlToObject(xmlData);
        System.out.println(exchangeDates);
        return exchangeDates;
    }
}