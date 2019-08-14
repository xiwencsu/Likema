package com.citi.intern.dao.impl;

import com.citi.intern.config.Constant;
import com.citi.intern.dao.DailySettlementDataDaoInterface;
import com.citi.intern.mapper.DailySettlementDataMapper;
import com.citi.intern.model.DailySettlementData;
import com.citi.intern.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DailySettlementDataDao implements DailySettlementDataDaoInterface {
    private static final Logger logger = LoggerFactory.getLogger(DailySettlementDataDao.class);
    @Autowired
    DailySettlementDataMapper dailySettlementDataMapper;

    @Override
    public List<DailySettlementData> getAllDailySettlementData(String stockName) {
        List<DailySettlementData> dstList = new ArrayList<>();
        List<String> dstStrList = FileUtil.readFile(Constant.getDailySettlementDataFileAbsPath(stockName));
        //need to skip header here
        for(int i = 1;i<dstStrList.size();i++){
            DailySettlementData dst = dailySettlementDataMapper.convert(dstStrList.get(i));
            if(dst!=null){
                dst.setStockName(stockName);
                dstList.add(dst);
            }
        }
        logger.info(dstList.toString());
        return dstList;
    }
}
