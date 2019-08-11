package com.citi.intern.mapper;

import com.citi.intern.model.DailySettlementData;
import com.citi.intern.model.Echart;

import java.util.List;

public interface DstEchartMapper {
    Echart convert(List<DailySettlementData> dailySettlementDataList);
}
