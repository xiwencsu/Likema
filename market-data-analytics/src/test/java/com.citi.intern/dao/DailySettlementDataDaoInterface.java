package com.citi.intern.dao;

import com.citi.intern.model.DailySettlementData;

import java.util.List;

public interface DailySettlementDataDaoInterface {
    List<DailySettlementData> getAllDailySettlementData(String stockName);
}
