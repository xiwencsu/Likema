package com.citi.intern.mapper;

import com.citi.intern.model.DailySettlementData;

public interface DailySettlementDataMapper {
    DailySettlementData convert(String dailySettlementDataStr);
}
