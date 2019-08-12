package com.citi.intern.service;

import com.citi.intern.model.StockData;

import java.util.List;

public interface StockDataService {
    List<StockData> getStockDataByPage(String date, Integer pageNo, Integer pageSize);
    List<StockData> getStockDateByNameByPage(String date, String name, Integer pageNo, Integer pageSize);
    List<StockData> getStockDateSortByVolumeByPage(String date, Integer pageNo, Integer pageSize);
}
