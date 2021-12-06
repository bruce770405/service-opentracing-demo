package com.bruce.serviceopentracing.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String getSomeone(){
        return "hello world";
    }
}
