package com.tuna.tcmbcurrency.repository;

import com.tuna.tcmbcurrency.model.table.CurrencyTable;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<CurrencyTable, Integer> {

}
