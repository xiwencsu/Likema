package com.citi.intern.service.impl;

import com.citi.intern.dao.DailySettlementDataDaoInterface;
import com.citi.intern.model.DailySettlementData;
import com.citi.intern.service.DailySettlementDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DailySettlementDataServiceImpl implements DailySettlementDataService {
    @Resource
    DailySettlementDataDaoInterface dailySettlementDataDaoInterface;

    @Override
    public List<DailySettlementData> queryDailySettlementDataByStock(String stockName) {
        return dailySettlementDataDaoInterface.getAllDailySettlementData(stockName);
    }
}
