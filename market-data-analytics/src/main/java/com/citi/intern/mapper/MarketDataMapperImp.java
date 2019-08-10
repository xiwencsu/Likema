package com.citi.intern.mapper;

import com.citi.intern.model.MarketData;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Component
public class MarketDataMapperImp implements MarketDataMapper{
    @Override
    public MarketData convert(String marketDataStr) {
        try{
            String[] strArray = new String[15];
            String[] marketDataStrArr = marketDataStr.split(",");
            System.arraycopy(marketDataStrArr,0,strArray,0,marketDataStrArr.length);

            MarketData marketData = new MarketData();
            //setup date
            DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String dataStr = strArray[0];
            dataStr = dataStr.substring(0, 4) + "-" + dataStr.substring(4, 6) + "-" + dataStr.substring(6, 8);
            marketData.setDate(format1.parse(dataStr));
            //setup time
            DateFormat format2 = new SimpleDateFormat("HH:mm");
            String timeStr = strArray[1];
            if (timeStr.length() == 3) {
                timeStr = "0" + timeStr.substring(0, 1) + ":" + timeStr.substring(1, 3);
            } else {
                timeStr = timeStr.substring(0, 2) + ":" + timeStr.substring(2, 4);
            }
            marketData.setTime(format2.parse(timeStr));
            marketData.setOpenPrice(Double.valueOf(strArray[2] == null ? "0" : strArray[2]));
            marketData.setHighPrice(Double.valueOf(strArray[3] == null ? "0" : strArray[3]));
            marketData.setLowPrice(Double.valueOf(strArray[4] == null ? "0" : strArray[4]));
            marketData.setClosePrice(Double.valueOf(strArray[5] == null ? "0" : strArray[5]));
            marketData.setTradeVolume(Double.valueOf(strArray[6] == null ? "0" : strArray[6]));
            marketData.setSplitFactor(Double.valueOf(strArray[7] == null ? "0" : strArray[7]));
            marketData.setEarnings(Double.valueOf(strArray[8] == null ? "0" : strArray[8]));
            marketData.setDividends(Double.valueOf(strArray[9] == null ? "0" : strArray[9]));
            marketData.setExtrapolation(Double.valueOf(strArray[10] == null ? "0" : strArray[10]));
            return marketData;
        }catch (Exception e){
            System.out.println("Error to format string : "+marketDataStr);
            return null;
        }
    }
}
