package com.tcbmcurrency.tcbmcurrency.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tcbmcurrency.tcbmcurrency.mapper.XmlToObjectMapper;
import com.tcbmcurrency.tcbmcurrency.model.ExchangeDates;
import com.tcbmcurrency.tcbmcurrency.service.FillObject;
import com.tcbmcurrency.tcbmcurrency.service.TcbmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
public class CurrencyController {

    @Autowired
    private TcbmService tcbmService;

    @Autowired
    private FillObject fillObject;


    @GetMapping("/hello")
    public String hello(){
        return "hello Tuna";
    }

    @GetMapping("/response")
    public String getResponse() throws JsonProcessingException {
        return tcbmService.getDataFromTcbm().toString();
    }

    @GetMapping("/fill-object")
    public ExchangeDates getData() throws JsonProcessingException {
        ExchangeDates exchangeDates = fillObject.printMap();
        System.out.println(exchangeDates.getCurrencyInfos());
        return exchangeDates;
    }

}
