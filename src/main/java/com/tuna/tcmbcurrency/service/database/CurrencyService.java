package com.tuna.tcmbcurrency.service.database;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tuna.tcmbcurrency.model.table.CurrencyTable;

import java.util.List;

public interface CurrencyService {
    List<CurrencyTable> getAllCurrencies();
    CurrencyTable getCurrencyById();
    List<CurrencyTable> saveCurrency() throws JsonProcessingException;
}
