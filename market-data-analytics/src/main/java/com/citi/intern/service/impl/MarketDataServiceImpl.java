package com.citi.intern.service.impl;

import com.citi.intern.dao.MarketDataFileDaoInterface;
import com.citi.intern.model.MarketData;
import com.citi.intern.service.MarketDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MarketDataServiceImpl implements MarketDataService {
    @Resource
    MarketDataFileDaoInterface marketDataFileDaoInterface;

    @Override
    public List<MarketData> queryMarketDataByDateAndStock(String date,String stockName) {
        return marketDataFileDaoInterface.getAllMarketData(date,stockName);
    }
}
