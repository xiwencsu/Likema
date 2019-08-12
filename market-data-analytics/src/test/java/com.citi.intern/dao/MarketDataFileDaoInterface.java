package com.citi.intern.dao;

import com.citi.intern.model.DailySettlementData;
import com.citi.intern.model.MarketData;

import java.util.List;

public interface MarketDataFileDaoInterface {
    List<MarketData> getAllMarketData(String date, String stockName);
}
