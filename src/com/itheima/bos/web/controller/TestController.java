package com.itheima.bos.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/test.action")
    public String test(){
        return "test/print";
    }
}
