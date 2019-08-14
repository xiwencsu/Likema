package com.citi.intern.service;

import com.citi.intern.wrapper.DataTableWrapper;

public interface SecuritiesDataService {
    DataTableWrapper getStockData(String date);
}
