package com.citi.intern.dao;

import com.citi.intern.model.SecurityData;

import java.util.List;

public interface SecuritiesDataFileDaoInterface {
    List<SecurityData> getStockData(String date);
}
