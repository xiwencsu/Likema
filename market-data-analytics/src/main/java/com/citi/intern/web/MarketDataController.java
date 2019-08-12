package com.citi.intern.web;

import com.citi.intern.mapper.DstEchartMapper;
import com.citi.intern.mapper.MarketDataMapper;
import com.citi.intern.mapper.TimelyEchartMapper;
import com.citi.intern.model.DailySettlementData;
import com.citi.intern.model.Echart;
import com.citi.intern.model.MarketData;
import com.citi.intern.service.MarketDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/marketData")
public class MarketDataController {

    @Resource
    private MarketDataService marketDataService;

    @Resource
    TimelyEchartMapper TimelyEchartMapper;

    @GetMapping("/list")
    public List<MarketData> list(@RequestParam String date, @RequestParam String stockName) {
        return marketDataService.queryMarketDataByDateAndStock(date, stockName);
    }

    @GetMapping("/count")
    public Integer count(@RequestParam String date, @RequestParam String stockName) {
        return marketDataService.queryMarketDataByDateAndStock(date, stockName).size();
    }

    @GetMapping("/getMarketEchart")
    public Echart getMarketEchart(@RequestParam String date, @RequestParam String stockName) {
        return TimelyEchartMapper.convert(marketDataService.queryMarketDataByDateAndStock(date, stockName));
    }
}