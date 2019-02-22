package com.example.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboapi.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDubboController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/test")
    public String test(){
        System.out.println(helloService);
        return helloService.sayHello("world");
    }
}
