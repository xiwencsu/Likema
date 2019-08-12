package com.citi.intern.mapper;

import com.citi.intern.model.MarketData;

public interface MarketDataMapper {
    MarketData convert(String marketDataStr);
}
