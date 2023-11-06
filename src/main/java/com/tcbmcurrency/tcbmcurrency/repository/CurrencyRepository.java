package com.tcbmcurrency.tcbmcurrency.repository;

import com.tcbmcurrency.tcbmcurrency.model.table.CurrencyTable;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<CurrencyTable, Integer> {

}
