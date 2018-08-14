package com.example.feign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImplHystric implements HelloServiceImpl {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
