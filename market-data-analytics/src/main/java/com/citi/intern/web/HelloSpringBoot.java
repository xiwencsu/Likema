package com.citi.intern.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloSpringBoot {

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String sayHello(){

        return "Hello Spring Boot!";

    }

    @RequestMapping(value="/first",method = RequestMethod.GET )
    public ModelAndView firstDemo(){
        return new ModelAndView("Echarttest");

        //跟templates文件夹下的test.html名字一样，返回这个界面

    }

    @RequestMapping(value="/courseClickCount",method = RequestMethod.GET)
    public ModelAndView courseClickCountStat(){

        return new ModelAndView("EchartDemo");//跟templates文件夹下的demo.html名字一样，返回这个界面

    }

    @RequestMapping(value="/TimeSharingChart",method = RequestMethod.GET)
    public ModelAndView TimeSharingChart(){

        return new ModelAndView("TimeSharing");//跟templates文件夹下的demo.html名字一样，返回这个界面

    }
}

