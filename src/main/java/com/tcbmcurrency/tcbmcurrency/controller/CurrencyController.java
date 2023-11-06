package com.tcbmcurrency.tcbmcurrency.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tcbmcurrency.tcbmcurrency.model.data.ExchangeDates;
import com.tcbmcurrency.tcbmcurrency.model.table.CurrencyTable;
import com.tcbmcurrency.tcbmcurrency.service.FillObject;
import com.tcbmcurrency.tcbmcurrency.service.TcbmService;
import com.tcbmcurrency.tcbmcurrency.service.database.CurrencyService;
import com.tcbmcurrency.tcbmcurrency.service.database.impl.CurrencyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    private TcbmService tcbmService;

    @Autowired
    private FillObject fillObject;

    @Autowired
    CurrencyService currencyService;


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

    @GetMapping("/save-database")
    public List<CurrencyTable> saveTable() throws JsonProcessingException {
        List<CurrencyTable> currencyTables = currencyService.saveCurrency();
        System.out.println(currencyTables);
        return currencyTables;
    }
}
