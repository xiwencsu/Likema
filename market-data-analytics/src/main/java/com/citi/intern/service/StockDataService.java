package com.citi.intern.service;

import com.citi.intern.util.DataTableWrapper;

public interface StockDataService {
    DataTableWrapper getStockData(String date);
    DataTableWrapper getStockDateByName(String date, String name);
    DataTableWrapper getStockDateSortByVolume(String date);
}
