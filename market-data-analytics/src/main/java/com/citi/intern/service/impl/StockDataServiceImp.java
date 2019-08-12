package com.citi.intern.service.impl;

import com.citi.intern.dao.StockDataFileDaoInterface;
import com.citi.intern.model.StockData;
import com.citi.intern.service.StockDataService;
import com.citi.intern.util.DataTableWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StockDataServiceImp implements StockDataService {

    @Autowired
    StockDataFileDaoInterface stockDataFileDaoInterface;

    @Override
    public DataTableWrapper getStockData(String date) {
        List<StockData> stockDataList =stockDataFileDaoInterface.getStockData(date);
        return dataTableWrapperHelp(stockDataList);
    }

    @Override
    public DataTableWrapper getStockDateByName(String date, String name) {
        List<StockData> stockDataList = stockDataFileDaoInterface.getStockData(date);
        System.out.print(name);
        List<StockData> stockDataListResult = new ArrayList<>();
        for(StockData stockData : stockDataList){
            if(stockData.getStockName().matches(".*" + name + ".*")){
                stockDataListResult.add(stockData);
            };
        }
        return dataTableWrapperHelp(stockDataListResult);
    }

    @Override
    public DataTableWrapper getStockDateSortByVolume(String date) {
        List<StockData> stockDataList =stockDataFileDaoInterface.getStockData(date);
        for(int i=0; i<stockDataList.size(); i++){
            for(int j=i+1; j<stockDataList.size(); j++){
                if(stockDataList.get(i).getTradeVolume() < stockDataList.get(j).getTradeVolume()){
                    StockData stockDataTmp = stockDataList.get(i);
                    stockDataList.set(i, stockDataList.get(j));
                    stockDataList.set(j, stockDataTmp);
                }
            }
        }
        return dataTableWrapperHelp(stockDataList);
    }

    private static DataTableWrapper dataTableWrapperHelp(List<StockData> stockDataList){
        DataTableWrapper dataTableWrapper = new DataTableWrapper();
        dataTableWrapper.setData(stockDataList);
        return dataTableWrapper;
    }


}
