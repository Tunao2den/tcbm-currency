package com.tuna.tcmbcurrency.mapper;

import com.tuna.tcmbcurrency.model.data.CurrencyInfo;
import com.tuna.tcmbcurrency.model.dto.CurrencyDTO;

public class CurrencyInfoToCurrencyDtoMapper {

    public CurrencyDTO toDto(CurrencyInfo currencyInfo) {
        CurrencyDTO currencyDTO = new CurrencyDTO();

        currencyDTO.setCrossOrder(currencyInfo.getCrossOrder());
        currencyDTO.setDate(null);
        currencyDTO.setCurrencyCode(currencyInfo.getCurrencyCode());
        currencyDTO.setUnit(currencyInfo.getUnit());
        currencyDTO.setCurrencyName(currencyInfo.getCurrencyName());
        currencyDTO.setForexBuying(currencyInfo.getForexBuying());
        currencyDTO.setForexSelling(currencyInfo.getForexSelling());
        currencyDTO.setBanknoteBuying(currencyInfo.getBanknoteBuying());
        currencyDTO.setBanknoteSelling(currencyInfo.getBanknoteSelling());

        return currencyDTO;
    }
}
