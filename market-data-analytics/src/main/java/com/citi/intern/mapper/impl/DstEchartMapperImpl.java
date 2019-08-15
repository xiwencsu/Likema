package com.citi.intern.mapper.impl;

import com.citi.intern.mapper.DstEchartMapper;
import com.citi.intern.model.DailySettlementData;
import com.citi.intern.wrapper.Echart;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DstEchartMapperImpl implements DstEchartMapper {
    @Override
    public Echart convert(List<DailySettlementData> dailySettlementDataList) {
        List<String> categoryData = new ArrayList<>();
        List<List<Double>> value = new ArrayList<>();
        List<Double> closeprice = new ArrayList<>();
        List<Double> TradeVolume= new ArrayList<>();
        String StockName = new String();
        for (int i = 0; i < dailySettlementDataList.size(); i++) {
            DailySettlementData dailySettlementData = dailySettlementDataList.get(i);
            categoryData.add(dailySettlementData.getDate());
            List<Double> priceValues = new ArrayList<>();
            closeprice.add(dailySettlementData.getClosePrice());
            TradeVolume.add(dailySettlementData.getTradeVolume());
            priceValues.add(dailySettlementData.getOpenPrice());
            priceValues.add(dailySettlementData.getClosePrice());
            priceValues.add(dailySettlementData.getLowPrice());
            priceValues.add(dailySettlementData.getHighPrice());
            value.add(priceValues);
            TradeVolume.add(dailySettlementData.getTradeVolume());
            StockName = dailySettlementData.getStockName();
        }
        Echart echart = new Echart();
        echart.setCategoryData(categoryData);
        echart.setValues(value);
        echart.setValue(closeprice);
        echart.setTradeVolume(TradeVolume);
        echart.setStockName(StockName);
        return echart;
    }

}