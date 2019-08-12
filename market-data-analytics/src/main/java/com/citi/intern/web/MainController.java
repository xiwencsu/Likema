package com.citi.intern.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Intellij IDEA.
 *
 * @Author LUOLIANG
 * @Date 2016/8/2
 * @Comment
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "/chart", method = RequestMethod.GET)
    public String index() {
        return "chart";
    }
    
    @RequestMapping(value = "/TimelySharingChart", method = RequestMethod.GET)
    public ModelAndView TimelySharing() {
        return new ModelAndView("TimeSharing");

    @RequestMapping(value = "/charts", method = RequestMethod.GET)
    public String charts() {
        return "charts";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "home";
    }
}
