package com.citi.intern.mapper.impl;

import com.citi.intern.mapper.TimelyEchartMapper;
import com.citi.intern.model.DailySettlementData;
import com.citi.intern.model.Echart;
import com.citi.intern.model.MarketData;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TimelyEchartMapperImp implements TimelyEchartMapper {
    @Override
    public Echart convert(List<MarketData> MaketDataList) {
        List<String> categoryData = new ArrayList<>();
        List<Double> value = new ArrayList<>();
        for (int i = 0; i < MaketDataList.size(); i++) {
            MarketData MarketData = MaketDataList.get(i);
            categoryData.add(MarketData.getTime());
            value.add(MarketData.getClosePrice());
//            priceValues.add(MarketData.getOpenPrice());
//            priceValues.add(MarketData.getClosePrice());
//            priceValues.add(MarketData.getLowPrice());
//            priceValues.add(MarketData.getHighPrice());
//            value.add(priceValues);
        }
        Echart echart = new Echart();
        echart.setCategoryData(categoryData);
        echart.setValue(value);
        return echart;
    }
}
