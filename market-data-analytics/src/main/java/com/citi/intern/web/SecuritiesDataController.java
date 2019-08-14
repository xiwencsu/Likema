package com.citi.intern.web;


import com.citi.intern.model.SecurityData;
import com.citi.intern.service.SecuritiesDataService;
import com.citi.intern.wrapper.DataTableWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class SecuritiesDataController {
    private static final Logger logger = LoggerFactory.getLogger(SecuritiesDataController.class);
    @Autowired
    SecuritiesDataService stockDataService;
    @RequestMapping("/list")
    DataTableWrapper getStockData(HttpServletRequest request, @RequestParam String date){
        logger.info(request.toString());
        logger.info("date:" + date);
        DataTableWrapper dataTableWrapper = stockDataService.getStockData(date);
        logger.info(dataTableWrapper.toString());
        return dataTableWrapper;
    }
}
