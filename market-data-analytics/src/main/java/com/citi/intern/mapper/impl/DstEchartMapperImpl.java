package com.citi.intern.mapper.impl;

import com.citi.intern.mapper.DstEchartMapper;
import com.citi.intern.model.DailySettlementData;
import com.citi.intern.model.Echart;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DstEchartMapperImpl implements DstEchartMapper {
    @Override
    public Echart convert(List<DailySettlementData> dailySettlementDataList) {
        List<String> categoryData = new ArrayList<>();
        List<List<Double>> value = new ArrayList<>();
        for (int i = 0; i < dailySettlementDataList.size(); i++) {
            DailySettlementData dailySettlementData = dailySettlementDataList.get(i);
            categoryData.add(dailySettlementData.getDate());
            List<Double> priceValues = new ArrayList<>();
            priceValues.add(dailySettlementData.getOpenPrice());
            priceValues.add(dailySettlementData.getClosePrice());
            priceValues.add(dailySettlementData.getLowPrice());
            priceValues.add(dailySettlementData.getHighPrice());
            value.add(priceValues);
        }
        Echart echart = new Echart();
        echart.setCategoryData(categoryData);
        echart.setValues(value);
        return echart;
    }
}
