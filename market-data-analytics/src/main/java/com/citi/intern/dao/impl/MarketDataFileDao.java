package com.citi.intern.dao.impl;

import com.citi.intern.config.Constant;
import com.citi.intern.dao.MarketDataFileDaoInterface;
import com.citi.intern.mapper.MarketDataMapper;
import com.citi.intern.model.MarketData;
import com.citi.intern.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MarketDataFileDao implements MarketDataFileDaoInterface {
    private static final Logger logger = LoggerFactory.getLogger(MarketDataFileDao.class);

    @Autowired
    MarketDataMapper marketDataMapper;

    @Override
    public List<MarketData> getAllMarketData(String date, String stockName) {
        List<MarketData> marketDataList = new ArrayList<>();
        List<String> marketDataStringList = FileUtil.readFile(Constant.getStockFileAbsPath(date, stockName));
        for (String str : marketDataStringList) {
            MarketData marketData = marketDataMapper.convert(str);
            if (marketData != null) {
                marketData.setStockName(stockName);
                marketDataList.add(marketData);
            }
        }
        logger.info(marketDataList.toString());
        return marketDataList;
    }
}
