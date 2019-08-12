package com.citi.intern.service;

import com.citi.intern.model.StockData;
import com.citi.intern.util.PageWrapper;

import java.util.List;

public interface StockDataService {
    List<PageWrapper> getStockDataByPage(String date, Integer pageNo, Integer pageSize);
    List<PageWrapper> getStockDateByNameByPage(String date, String name, Integer pageNo, Integer pageSize);
    List<PageWrapper> getStockDateSortByVolumeByPage(String date, Integer pageNo, Integer pageSize);
}
