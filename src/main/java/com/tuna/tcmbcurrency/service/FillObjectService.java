package com.tuna.tcmbcurrency.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tuna.tcmbcurrency.mapper.XmlToObjectMapper;
import com.tuna.tcmbcurrency.model.data.ExchangeDates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FillObjectService {

    @Autowired
    private TcmbService tcmbService;

    public ExchangeDates printMap() throws JsonProcessingException {
        XmlToObjectMapper xmlToObjectMapper = new XmlToObjectMapper();

        String xmlData = tcmbService.getDataFromTcbm();
        ExchangeDates exchangeDates = xmlToObjectMapper.xmlToObject(xmlData);
        System.out.println(exchangeDates);
        return exchangeDates;
    }
}