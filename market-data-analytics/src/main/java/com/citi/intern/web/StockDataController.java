package com.citi.intern.web;

import com.citi.intern.model.StockData;
import com.citi.intern.service.StockDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockDataController {
    @Autowired
    StockDataService stockDataService;
    @RequestMapping("/list")
    List<StockData> getStockData(@RequestParam String date, @RequestParam Integer pageNo, @RequestParam Integer pageSize){
        return stockDataService.getStockDataByPage(date, pageNo, pageSize);
    }

    @RequestMapping("/search")
    List<StockData> getStockDateByName(@RequestParam String date, @RequestParam String name, @RequestParam Integer pageNo, @RequestParam Integer pageSize){
        return stockDataService.getStockDateByNameByPage(date, name, pageNo, pageSize);
    }

    @RequestMapping("/sortByVolume")
    List<StockData> getStockDateSortByVolumeByPage(@RequestParam String date, @RequestParam Integer pageNo, @RequestParam Integer pageSize){
        return stockDataService.getStockDateSortByVolumeByPage(date, pageNo, pageSize);
    }
}
