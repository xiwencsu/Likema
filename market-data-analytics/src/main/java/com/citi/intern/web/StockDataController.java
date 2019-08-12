package com.citi.intern.web;

import com.citi.intern.service.StockDataService;
import com.citi.intern.util.DataTableWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockDataController {
    @Autowired
    StockDataService stockDataService;
    @RequestMapping("/list")
    DataTableWrapper getStockData(@RequestParam String date){
        return stockDataService.getStockData(date);
    }

    @RequestMapping("/search")
    DataTableWrapper getStockDateByName(@RequestParam String date, @RequestParam String name){
        return stockDataService.getStockDateByName(date, name);
    }

    @RequestMapping("/sortByVolume")
    DataTableWrapper getStockDateSortByVolumeByPage(@RequestParam String date){
        return stockDataService.getStockDateSortByVolume(date);
    }
}
