package com.zps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zps on 2020/5/23 23:06
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/method1")
    public String method1(){
        return "method1";
    }

    @RequestMapping("/method2")
    public String method2(){
        return "index";
    }




}
