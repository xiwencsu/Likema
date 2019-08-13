package com.citi.intern.service;

import com.citi.intern.model.DailySettlementData;
import com.citi.intern.model.Portfolios;

import java.util.List;

public interface DailySettlementDataService {
    List<DailySettlementData> queryDailySettlementDataByStock(String stockName);

    List<Object> queryDailySettlementDataByStocks(String[] stockNames);
}
