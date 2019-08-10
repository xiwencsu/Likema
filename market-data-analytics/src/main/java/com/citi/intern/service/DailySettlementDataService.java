package com.citi.intern.service;

import com.citi.intern.model.DailySettlementData;

import java.util.List;

public interface DailySettlementDataService {
    List<DailySettlementData> queryDailySettlementDataByStock(String stockName);
}
