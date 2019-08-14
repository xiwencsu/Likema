package com.citi.intern.web;

import org.hibernate.validator.constraints.Range;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class RouteController {
    private static final Logger logger = LoggerFactory.getLogger(RouteController.class);
    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        logger.info("home request start\n" + request.toString() + "\n home request end");
        return "index";
    }

    @RequestMapping("/securities")
    public String security(HttpServletRequest request, @RequestParam String name, @RequestParam String date, ModelMap modelMap){
        logger.info("portfolios request start\n" + request.toString() + "\n portfolios request end");
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("date", date);
        return "securities";
    }

    @RequestMapping("/portfolios")
    public String portfolios(HttpServletRequest request){
        logger.info("portfolios request start\n" + request.toString() + "\n portfolios request end");
        Cookie[] cookies =  request.getCookies();
        if(cookies != null){
            logger.info("cookie info start");
            for(Cookie cookie : cookies){
                logger.info(cookie.getName() + cookie.getValue());
            }
            logger.info("cookie info end");
        }
        return "portfolios";
    }

    @RequestMapping(value = "/TimelySharingChart", method = RequestMethod.GET)
    public ModelAndView TimelySharing() {
        return new ModelAndView("TimeSharing");
    }

}
