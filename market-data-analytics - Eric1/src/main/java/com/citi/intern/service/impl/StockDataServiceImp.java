package com.citi.intern.service.impl;

import com.citi.intern.dao.StockDataFileDaoInterface;
import com.citi.intern.model.StockData;
import com.citi.intern.service.StockDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StockDataServiceImp implements StockDataService {

    @Autowired
    StockDataFileDaoInterface stockDataFileDaoInterface;

    @Override
    public List<StockData> getStockDataByPage(String date, Integer pageNo, Integer pageSize) {
        List<StockData> stockDataList =stockDataFileDaoInterface.getStockData(date);
        return pageHelp(stockDataList, pageNo, pageSize);
    }

    @Override
    public List<StockData> getStockDateByNameByPage(String date, String name, Integer pageNo, Integer pageSize) {
        List<StockData> stockDataList = stockDataFileDaoInterface.getStockData(date);
        System.out.print(name);
        List<StockData> stockDataListResult = new ArrayList<>();
        for(StockData stockData : stockDataList){
            if(stockData.getStockName().matches(".*" + name + ".*")){
                stockDataListResult.add(stockData);
            };
        }
        return pageHelp(stockDataListResult, pageNo, pageSize);
    }

    @Override
    public List<StockData> getStockDateSortByVolumeByPage(String date, Integer pageNo, Integer pageSize) {
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
        return pageHelp(stockDataList, pageNo, pageSize);
    }

    private static List<StockData> pageHelp(List<StockData> stockDataList, Integer pageNo, Integer pageSize){
        List<StockData> stockDataResultList = new ArrayList<>();
        Integer i = -1;
        Integer startCount = pageNo * pageSize;
        Integer endCount = (pageNo + 1)*pageSize;
        for(StockData stockData : stockDataList){
            i++;
            if(i < startCount){
                continue;
            }
            if(i >= endCount){
                break;
            }
            stockDataResultList.add(stockData);
        }

        return stockDataResultList;
    }


}
