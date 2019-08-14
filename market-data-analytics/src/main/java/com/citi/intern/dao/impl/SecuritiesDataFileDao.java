package com.citi.intern.dao.impl;

import com.citi.intern.config.Constant;
import com.citi.intern.dao.SecuritiesDataFileDaoInterface;
import com.citi.intern.mapper.SecuritiesDataMapper;
import com.citi.intern.model.SecurityData;
import com.citi.intern.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SecuritiesDataFileDao implements SecuritiesDataFileDaoInterface {
    private static final Logger logger = LoggerFactory.getLogger(SecuritiesDataFileDao.class);
    @Autowired
    SecuritiesDataMapper stockDataMapper;
    @Override
    public List<SecurityData> getStockData(String date) {
        List<SecurityData> stockDataList = new ArrayList<>();
        List<String> stockDataStringList = FileUtil.readFile(Constant.getStockDateDailyAsPath(date));
        Boolean tableName = Boolean.FALSE;
        for(String str : stockDataStringList){
            if(tableName == Boolean.FALSE){
                tableName = Boolean.TRUE;
                continue;
            }
            SecurityData stockData = stockDataMapper.convert(str);
            stockDataList.add(stockData);
        }
        logger.info(stockDataList.toString());
        return stockDataList;
    }
}
