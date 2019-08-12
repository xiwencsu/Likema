package com.citi.intern.service;

import com.citi.intern.model.MarketData;

import java.util.List;

public interface MarketDataService {
    List<MarketData> queryMarketDataByDateAndStock(String date,String stockName);
}
