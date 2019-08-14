package com.citi.intern.service.impl;

import com.citi.intern.dao.SecuritiesDataFileDaoInterface;
import com.citi.intern.model.SecurityData;
import com.citi.intern.service.SecuritiesDataService;
import com.citi.intern.wrapper.DataTableWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SecuritiesDataServiceImp implements SecuritiesDataService {

    @Autowired
    SecuritiesDataFileDaoInterface stockDataFileDaoInterface;

    @Override
    public DataTableWrapper getStockData(String date) {
        List<SecurityData> stockDataList =stockDataFileDaoInterface.getStockData(date);
        return dataTableWrapperHelp(stockDataList);
    }


    private static DataTableWrapper dataTableWrapperHelp(List<SecurityData> stockDataList){
        DataTableWrapper dataTableWrapper = new DataTableWrapper();
        dataTableWrapper.setData(stockDataList);
        return dataTableWrapper;
    }


}
