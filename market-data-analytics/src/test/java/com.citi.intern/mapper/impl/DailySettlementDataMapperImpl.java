package com.citi.intern.mapper.impl;

import com.citi.intern.mapper.DailySettlementDataMapper;
import com.citi.intern.model.DailySettlementData;
import org.springframework.stereotype.Component;

@Component
public class DailySettlementDataMapperImpl implements DailySettlementDataMapper {
    @Override
    public DailySettlementData convert(String dailySettlementDataStr) {
        if(dailySettlementDataStr==null||dailySettlementDataStr.length()==0){
            return null;
        }
        try{
            String[] strArray = new String[15];
            String[] marketDataStrArr = dailySettlementDataStr.split(",");
            System.arraycopy(marketDataStrArr,0,strArray,0,marketDataStrArr.length);

            DailySettlementData dailySettlementData = new DailySettlementData();
            dailySettlementData.setDate(strArray[0]==null?"":strArray[0]);
            dailySettlementData.setOpenPrice(Double.valueOf(strArray[1] == null ? "0" : strArray[1]));
            dailySettlementData.setHighPrice(Double.valueOf(strArray[2] == null ? "0" : strArray[2]));
            dailySettlementData.setLowPrice(Double.valueOf(strArray[3] == null ? "0" : strArray[3]));
            dailySettlementData.setClosePrice(Double.valueOf(strArray[4] == null ? "0" : strArray[4]));
            dailySettlementData.setTradeVolume(Double.valueOf(strArray[5] == null ? "0" : strArray[5]));
            return dailySettlementData;
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Error to format string : "+dailySettlementDataStr);
            return null;
        }
    }
}
