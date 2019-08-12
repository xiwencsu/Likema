package com.citi.intern.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "/DailyCandlestickChart", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/TimelySharingChart", method = RequestMethod.GET)
    public ModelAndView TimelySharing() {
        return new ModelAndView("TimeSharing");
    }

    @RequestMapping(value = "/OHLCChart", method = RequestMethod.GET)
    public ModelAndView OHLC() {
        return new ModelAndView("OHLC");
    }
//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String home() {
//        return "home";
//    }
}
