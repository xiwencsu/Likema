package com.citi.intern.web;

import com.citi.intern.mapper.DstEchartMapper;
import com.citi.intern.model.DailySettlementData;
import com.citi.intern.wrapper.Echart;
import com.citi.intern.service.DailySettlementDataService;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dst")
public class DailySettlementDataController {
    private static final Logger logger = LoggerFactory.getLogger(DailySettlementDataController.class);
    @Resource
    DailySettlementDataService dailySettlementDataService;

    @Resource
    DstEchartMapper dstEchartMapper;

    @GetMapping("/list")
    public List<DailySettlementData> list(HttpServletRequest request,  @RequestParam String stockName) {
        logger.info(request.toString());
        logger.info("stockName :" + stockName);
        List<DailySettlementData> dailySettlementDataList = dailySettlementDataService.queryDailySettlementDataByStock(stockName);
        logger.info(dailySettlementDataList.toString());
        return dailySettlementDataList;
    }

    @GetMapping("/count")
    public Integer count(HttpServletRequest request, @RequestParam String stockName) {
        logger.info(request.toString());
        logger.info("stockName :" + stockName);
        Integer size = dailySettlementDataService.queryDailySettlementDataByStock(stockName).size();
        logger.info("size: " + size );
        return size;
    }

    @GetMapping("/getDstEchart")
    public Echart getDstEchart(HttpServletRequest request, @RequestParam String stockName) {
        logger.info(request.toString());
        logger.info("stockName :" + stockName);
        List<DailySettlementData> dailySettlementDataList = dailySettlementDataService.queryDailySettlementDataByStock(stockName);
        logger.info(dailySettlementDataList.toString());
        Echart echart = dstEchartMapper.convert(dailySettlementDataList);
        logger.info(echart.toString());
        return echart;
    }
}
