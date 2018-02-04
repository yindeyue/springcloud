package com.yindeyue.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yindeyue.springcloud.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
    @RequestMapping(value = "/shiyan")
    public String shiyan(@RequestParam String name){
        return helloService.shiyanService(name);
    }


}
