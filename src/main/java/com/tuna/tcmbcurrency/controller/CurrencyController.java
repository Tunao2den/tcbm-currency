package com.tuna.tcmbcurrency.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tuna.tcmbcurrency.model.data.ExchangeDates;
import com.tuna.tcmbcurrency.model.table.CurrencyTable;
import com.tuna.tcmbcurrency.service.FillObjectService;
import com.tuna.tcmbcurrency.service.TcmbService;
import com.tuna.tcmbcurrency.service.database.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    private TcmbService tcmbService;

    @Autowired
    private FillObjectService fillObjectService;

    @Autowired
    CurrencyService currencyService;
    @GetMapping("/hello")
    public String hello(){
        return "hello Tuna";
    }
    @GetMapping("/response")
    public String getResponse() throws JsonProcessingException {
        return tcmbService.getDataFromTcbm();
    }
    @GetMapping("/fill-object")
    public ExchangeDates getData() throws JsonProcessingException {
        ExchangeDates exchangeDates = fillObjectService.printMap();
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
