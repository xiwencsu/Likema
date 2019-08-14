package com.citi.intern.web;

import com.citi.intern.mapper.TimelyEchartMapper;
import com.citi.intern.wrapper.Echart;
import com.citi.intern.model.MarketData;
import com.citi.intern.service.MarketDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/marketData")
public class MarketDataController {
    private static final Logger logger = LoggerFactory.getLogger(MarketDataController.class);
    @Resource
    private MarketDataService marketDataService;

    @Resource
    TimelyEchartMapper TimelyEchartMapper;

    @GetMapping("/list")
    public List<MarketData> list(HttpServletRequest request, @RequestParam String date, @RequestParam String stockName) {
        logger.info(request.toString());
        logger.info("date:" + date +";stockName" + stockName);
        List<MarketData> marketDataList = marketDataService.queryMarketDataByDateAndStock(date, stockName);
        logger.info(marketDataList.toString());
        return marketDataList;
    }

    @GetMapping("/count")
    public Integer count(HttpServletRequest request, @RequestParam String date, @RequestParam String stockName) {
        logger.info(request.toString());
        logger.info("date:" + date +";stockName" + stockName);
        Integer size = marketDataService.queryMarketDataByDateAndStock(date, stockName).size();
        logger.info("size:" + size);
        return size;
    }

    @GetMapping("/getMarketEchart")
    public Echart getMarketEchart(HttpServletRequest request, @RequestParam String date, @RequestParam String stockName) {
        logger.info(request.toString());
        logger.info("date:" + date +";stockName" + stockName);
        List<MarketData> marketDataList = marketDataService.queryMarketDataByDateAndStock(date, stockName);
        Echart echart =  TimelyEchartMapper.convert(marketDataList);
        logger.info(marketDataList.toString());
        logger.info(echart.toString());
        return echart;
    }
}