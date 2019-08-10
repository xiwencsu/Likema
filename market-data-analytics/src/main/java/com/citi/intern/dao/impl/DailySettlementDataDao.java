package com.citi.intern.dao.impl;

import com.citi.intern.config.Constant;
import com.citi.intern.dao.DailySettlementDataDaoInterface;
import com.citi.intern.mapper.DailySettlementDataMapper;
import com.citi.intern.model.DailySettlementData;
import com.citi.intern.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DailySettlementDataDao implements DailySettlementDataDaoInterface {
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
        return dstList;
    }
}
