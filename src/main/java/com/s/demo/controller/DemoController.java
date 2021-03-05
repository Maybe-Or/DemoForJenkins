package com.s.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DemoController {

    @RequestMapping("index")
    public String index(){
        return "hello,this is a demo!";
    }
}
