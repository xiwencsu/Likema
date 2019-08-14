package com.citi.intern.web;

import com.citi.intern.config.Portfolios;
import com.citi.intern.model.Portfolio;
import com.citi.intern.service.DailySettlementDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/portfolios")
public class PortfoliosController {

    private static final Logger logger = LoggerFactory.getLogger(PortfoliosController.class);

    @Autowired
    DailySettlementDataService dailySettlementDataService;

    @GetMapping("/portfoliosEchartData")
    public List<Object> getEricOnePortfolio(HttpServletRequest request, @RequestParam String portfolioName) {
        logger.info(request.toString());
        logger.info(portfolioName);
        Portfolio portfolio = new Portfolio();
        for(Portfolio pf: Portfolios.portfolios){
            if(pf.getName().equals(portfolioName)){
                portfolio.setStockNames(pf.getStockNames());
            }
        }
        logger.info(portfolio.toString());
        List<Object> stocks = dailySettlementDataService.queryDailySettlementDataByStocks(portfolio.getStockNames());
        logger.info(stocks.toString());
        return stocks;
    }


    @GetMapping("/ClairPortfolio")
    public List<Object> getClairPortfolio(HttpServletRequest request, @RequestParam String stockNames) {
        logger.info(request.toString());
        logger.info("stockNames :" + stockNames);
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
        logger.info("stockNamesArrayResult :" + stockNamesArrayResult);
        List<Object> stocks = dailySettlementDataService.queryDailySettlementDataByStocks(stockNamesArrayResult);
        logger.info(stocks.toString());
        return stocks;
    }


    @GetMapping("/MoniPortfolio")
    public List<Object> getMoniPortfolio(HttpServletRequest request, @RequestParam String stockNames) {
        logger.info(request.toString());
        logger.info("stockNames :" + stockNames);
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
        logger.info("stockNamesArrayResult :" + stockNamesArrayResult);
        List<Object> stocks = dailySettlementDataService.queryDailySettlementDataByStocks(stockNamesArrayResult);
        logger.info(stocks.toString());
        return stocks;
    }

    @GetMapping("/RayPortfolio")
    public List<Object> getRayPortfolio(HttpServletRequest request, @RequestParam String stockNames) {
        logger.info(request.toString());
        logger.info("stockNames :" + stockNames);
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
        logger.info("stockNamesArrayResult :" + stockNamesArrayResult);
        List<Object> stocks = dailySettlementDataService.queryDailySettlementDataByStocks(stockNamesArrayResult);
        logger.info(stocks.toString());
        return stocks;
    }
}
