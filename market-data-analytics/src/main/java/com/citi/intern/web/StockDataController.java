package com.citi.intern.web;

import com.citi.intern.service.StockDataService;
import com.citi.intern.util.PageWrapper;
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
    List<PageWrapper> getStockData(@RequestParam String date, @RequestParam Integer pageNo, @RequestParam Integer pageSize){
        return stockDataService.getStockDataByPage(date, pageNo, pageSize);
    }

    @RequestMapping("/search")
    List<PageWrapper> getStockDateByName(@RequestParam String date, @RequestParam String name, @RequestParam Integer pageNo, @RequestParam Integer pageSize){
        return stockDataService.getStockDateByNameByPage(date, name, pageNo, pageSize);
    }

    @RequestMapping("/sortByVolume")
    List<PageWrapper> getStockDateSortByVolumeByPage(@RequestParam String date, @RequestParam Integer pageNo, @RequestParam Integer pageSize){
        return stockDataService.getStockDateSortByVolumeByPage(date, pageNo, pageSize);
    }
}
