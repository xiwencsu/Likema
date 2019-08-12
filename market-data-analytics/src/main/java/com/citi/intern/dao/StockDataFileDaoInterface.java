package com.citi.intern.dao;

import com.citi.intern.model.StockData;

import java.util.List;

public interface StockDataFileDaoInterface {
    List<StockData> getStockData(String date);
}
