package com.offcn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/html")
    public String toHtml(){
        return "vue1";
    }

    @GetMapping(value = "test11111")
    public String test11111(){
        return "123";
    }

}
