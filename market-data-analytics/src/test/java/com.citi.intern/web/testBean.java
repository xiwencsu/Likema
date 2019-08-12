package com.citi.intern.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("testBean")
public class testBean {
    @RequestMapping("/test")
    public String testDemo(){
        return "index";
    }

    @RequestMapping("/testHello")
    public String testHello(){
        return "hello";
    }
}
