package com.citi.intern.web;

import com.citi.intern.model.DailySettlementData;
import com.citi.intern.service.DailySettlementDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dst")
public class DailySettlementDataController {
    @Resource
    DailySettlementDataService dailySettlementDataService;

    @GetMapping("/list")
    public List<DailySettlementData> list(@RequestParam String stockName) {
        return dailySettlementDataService.queryDailySettlementDataByStock(stockName);
    }

    @GetMapping("/count")
    public Integer count(@RequestParam String stockName) {
        return dailySettlementDataService.queryDailySettlementDataByStock(stockName).size();
    }
}
