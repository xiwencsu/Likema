package com.citi.intern.dao.impl;

import com.citi.intern.dao.StockDataFileDaoInterface;
import com.citi.intern.mapper.StockDataMapper;
import com.citi.intern.model.StockData;
import com.citi.intern.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StockDataFileDao implements StockDataFileDaoInterface {

    @Autowired
    StockDataMapper stockDataMapper;
    @Override
    public List<StockData> getStockData(String date) {
        List<StockData> stockDataList = new ArrayList<>();
        List<String> stockDataStringList = FileUtil.readFile("F:\\citi_project\\Likema\\Likema\\Day Data\\" + date + ".csv");
        Boolean tableName = Boolean.FALSE;
        for(String str : stockDataStringList){
            if(tableName == Boolean.FALSE){
                tableName = Boolean.TRUE;
                continue;
            }
            StockData stockData = stockDataMapper.convert(str);
            stockDataList.add(stockData);
        }
        return stockDataList;
    }
}
