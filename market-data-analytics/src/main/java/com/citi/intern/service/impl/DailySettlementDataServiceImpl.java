package com.citi.intern.service.impl;

import com.citi.intern.dao.DailySettlementDataDaoInterface;
import com.citi.intern.model.DailySettlementData;
import com.citi.intern.wrapper.EchartsPortfoliosEntity;
import com.citi.intern.service.DailySettlementDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DailySettlementDataServiceImpl implements DailySettlementDataService {
    @Resource
    DailySettlementDataDaoInterface dailySettlementDataDaoInterface;

    @Override
    public List<DailySettlementData> queryDailySettlementDataByStock(String stockName) {
        return dailySettlementDataDaoInterface.getAllDailySettlementData(stockName);
    }

    @Override
    public List<Object> queryDailySettlementDataByStocks(List<String> stockNames) {
//        Portfolios portfolios = new Portfolios();
        List<Object> stocks = new ArrayList<>();
        List<String> categories = new ArrayList<>();
        Boolean addCategories = Boolean.TRUE;
        for(String stockName : stockNames){
            List<DailySettlementData> dailySettlementDataList = dailySettlementDataDaoInterface.getAllDailySettlementData(stockName);
            List<Double> values = new ArrayList<>();
            for(DailySettlementData dailySettlementData : dailySettlementDataList){
                if (addCategories == Boolean.TRUE){
                    categories.add(dailySettlementData.getDate());
                }
                values.add(dailySettlementData.getClosePrice());
            }
            if(addCategories == Boolean.TRUE){
                stocks.add(categories);
                addCategories = Boolean.FALSE;
            }
            EchartsPortfoliosEntity echartsPortfoliosEntity = new EchartsPortfoliosEntity();
            echartsPortfoliosEntity.setName(stockName);
            echartsPortfoliosEntity.setType("line");
            echartsPortfoliosEntity.setData(values);
            stocks.add(echartsPortfoliosEntity);
        }
        return stocks;
    }
}
