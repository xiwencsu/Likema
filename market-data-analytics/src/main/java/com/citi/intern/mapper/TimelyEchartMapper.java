package com.citi.intern.mapper;

import com.citi.intern.model.Echart;
import com.citi.intern.model.MarketData;

import java.util.List;

public interface TimelyEchartMapper {
    Echart convert(List<MarketData> MarketDataList);
}
