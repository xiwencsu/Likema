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

/**
 * give all of portfolios in portfolios page
 * @Author Eric1
 */

@RestController
@RequestMapping("/portfolios")
public class PortfoliosController {

    private static final Logger logger = LoggerFactory.getLogger(PortfoliosController.class);

    @Autowired
    DailySettlementDataService dailySettlementDataService;

    /**
     * frontend uses ajax to get portfolios data in Echart format by portfolioName
     * @param portfolioName
     */
    @GetMapping("/portfoliosEchartData")
    public List<Object> getEricOnePortfolio(HttpServletRequest request, @RequestParam String portfolioName) {

        logger.info(request.toString());
        logger.info(portfolioName);

        // use portfolio name to get stockNames in portfolio
        Portfolio portfolio = new Portfolio();
        for(Portfolio pf: Portfolios.portfolios){
            if(pf.getName().equals(portfolioName)){
                portfolio.setStockNames(pf.getStockNames());
            }
        }
        logger.info(portfolio.toString());

        //get stocks data by names
        List<Object> stocks = dailySettlementDataService.queryDailySettlementDataByStocks(portfolio.getStockNames());
        logger.info(stocks.toString());

        return stocks;
    }
}
