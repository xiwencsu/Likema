package com.citi.intern.web;


import com.citi.intern.service.DailySettlementDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * give all of securities data in my portfolio page
 * @Author Eric1
 */

@RestController
@RequestMapping("/myPortfolio")
public class MyPortfoliosController {
    private static final Logger logger = LoggerFactory.getLogger(MyPortfoliosController.class);
    @Resource
    DailySettlementDataService dailySettlementDataService;

    /**
     * frontend uses ajax to get securities data in Echart format by stockNames
     * @param stockNames
     */
    @GetMapping("/getMyPortfolioEchart")
    public List<Object> getMyPortfoliosEchart(HttpServletRequest request, @RequestParam String stockNames) {
        logger.info(request.toString());
        logger.info("stockNames :" + stockNames);

        //front end stockNames in format like "-stock1-stock2-..."
        //parse stock names in parameter stockNames
        String[] stockNamesArray = stockNames.split("-");
        if(stockNames == null || stockNames.length() == 0){
            logger.warn("stockNames is null or '' there is no security");
            return null;
        }
        if(stockNamesArray.length == 1){
            logger.warn("stockNames equal '-' there is no security");
            return null;
        }
        List<String> stockNamesArrayResult = new ArrayList<>(); // Raw Collection
        for(int i=1; i<stockNamesArray.length; i++){
            stockNamesArrayResult.add(stockNamesArray[i]);
        }

        //get stocks data in echart format by stock names in my portfolio
        logger.info("stockNamesArrayResult :" + stockNamesArrayResult);
        List<Object> stocks = dailySettlementDataService.queryDailySettlementDataByStocks(stockNamesArrayResult);
        logger.info(stocks.toString());
        return stocks;
    }
}
