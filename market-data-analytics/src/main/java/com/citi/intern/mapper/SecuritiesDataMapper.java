package com.citi.intern.mapper;

import com.citi.intern.model.SecurityData;

public interface SecuritiesDataMapper {
    SecurityData convert(String stockDataStr);
}
