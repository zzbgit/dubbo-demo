package com.example.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboapi.service.HelloService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String str) {
        return "Hello " + str + "!";
    }
}
