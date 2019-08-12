package com.citi.intern.mapper;

import com.citi.intern.model.StockData;

public interface StockDataMapper {
    StockData convert(String stockDataStr);
}
