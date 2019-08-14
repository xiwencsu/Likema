package com.citi.intern.mapper.impl;

import com.citi.intern.mapper.SecuritiesDataMapper;
import com.citi.intern.model.SecurityData;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Component
public class StockDataMapperImp implements SecuritiesDataMapper {
    @Override
    public SecurityData convert(String stockDataStr) {
        try{
            String[] strArray = new String[15];
            String[] stockDataStrArr = stockDataStr.split(",");
            System.arraycopy(stockDataStrArr,0,strArray,0,stockDataStrArr.length);

            SecurityData stockData = new SecurityData();
            //setup date
            DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String dataStr = strArray[0];
            dataStr = dataStr.substring(0, 4) + "-" + dataStr.substring(4, 6) + "-" + dataStr.substring(6, 8);
            stockData.setDate(format1.parse(dataStr));
            stockData.setStockName(strArray[1] == null ? "" : strArray[1]);
            stockData.setOpenPrice(Double.valueOf(strArray[2] == null ? "0" : strArray[2]));
            stockData.setHighPrice(Double.valueOf(strArray[3] == null ? "0" : strArray[3]));
            stockData.setLowPrice(Double.valueOf(strArray[4] == null ? "0" : strArray[4]));
            stockData.setClosePrice(Double.valueOf(strArray[5] == null ? "0" : strArray[5]));
            stockData.setTradeVolume(Double.valueOf(strArray[6] == null ? "0" : strArray[6]));
            return stockData;
        }catch (Exception e){
            System.out.println("Error to format string : "+stockDataStr);
            return null;
        }
    }
}
