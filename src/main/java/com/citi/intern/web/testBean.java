package com.citi.intern.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/testBean")
public class testBean {
    @RequestMapping("/test")
    public String testDemo(){
        return "index";
    }

    @RequestMapping(value="/testData",method= RequestMethod.POST)
    public Map<String,Object> testData(){
        Map<String, Object> result = new HashMap<>();
        //键名要是aaData前端的datatables插件才可以拿到数据
        Map<String, String> datas = new HashMap<>();
        datas.put("date","20190811");
        datas.put("symbol","ABCDEF");
        datas.put("open","1");
        datas.put("high","2");
        datas.put("low","2");
        datas.put("close","2");
        datas.put("volume","1000");
        result.put("aaData", datas);
        return result;
    }

    @RequestMapping("/testHello")
    public String testHello(){
        return "hello";
    }
}
