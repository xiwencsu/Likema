package com.citi.intern.web;

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

    @GetMapping("/list")
    public List<MarketData> list(@RequestParam String date, @RequestParam String stockName) {
        return marketDataService.queryMarketDataByDateAndStock(date, stockName);
    }
}
