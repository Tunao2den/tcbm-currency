package com.tuna.tcmbcurrency.service.database.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tuna.tcmbcurrency.mapper.CurrencyInfoToCurrencyDtoMapper;
import com.tuna.tcmbcurrency.model.data.CurrencyInfo;
import com.tuna.tcmbcurrency.model.data.ExchangeDates;
import com.tuna.tcmbcurrency.model.dto.CurrencyDTO;
import com.tuna.tcmbcurrency.model.table.CurrencyTable;
import com.tuna.tcmbcurrency.repository.CurrencyRepository;
import com.tuna.tcmbcurrency.service.FillObjectService;
import com.tuna.tcmbcurrency.service.database.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;
    @Autowired
    FillObjectService fillObjectService;


    @Override
    public List<CurrencyTable> getAllCurrencies() {
        return null;
    }

    @Override
    public CurrencyTable getCurrencyById() {
        return null;
    }
    @Override
    public List<CurrencyTable> saveCurrency() throws JsonProcessingException {
        CurrencyInfoToCurrencyDtoMapper currencyInfoToCurrencyDtoMapper = new CurrencyInfoToCurrencyDtoMapper();

        ExchangeDates exchangeDates = fillObjectService.printMap();
        List<CurrencyInfo> currencyInfos = exchangeDates.getCurrencyInfos();
        List<CurrencyDTO> currencyDTOS = new ArrayList<>();
        for (CurrencyInfo currencyInfo :currencyInfos){
            CurrencyDTO currencyDTO = currencyInfoToCurrencyDtoMapper.toDto(currencyInfo);
            currencyDTOS.add(currencyDTO);
        }

        List<CurrencyTable> currencyTables = new ArrayList<>();
        for (CurrencyDTO currencyDTO: currencyDTOS){
            CurrencyTable currencyTable = new CurrencyTable();
            currencyTable.setCrossOrder(currencyDTO.getCrossOrder());
            currencyTable.setDate(exchangeDates.getDate());
            currencyTable.setCurrencyCode(currencyDTO.getCurrencyCode());
            currencyTable.setUnit(currencyDTO.getUnit());
            currencyTable.setCurrencyName(currencyDTO.getCurrencyName());
            currencyTable.setForexBuying(currencyDTO.getForexBuying());
            currencyTable.setForexSelling(currencyDTO.getForexSelling());
            currencyTable.setBanknoteBuying(currencyDTO.getBanknoteBuying());
            currencyTable.setBanknoteSelling(currencyDTO.getBanknoteSelling());
            currencyTables.add(currencyTable);
        }

        for (CurrencyTable currencyTable: currencyTables){
            currencyRepository.save(currencyTable);
            System.out.println(currencyTable);
        }

        return currencyTables;
    }
}
