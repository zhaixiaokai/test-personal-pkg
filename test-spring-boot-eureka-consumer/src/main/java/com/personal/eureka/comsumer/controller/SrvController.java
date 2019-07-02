package com.personal.eureka.comsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SrvController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("greeting")
    private String sayHello() {

        String toReturn = restTemplate.getForObject("http://service-provider/greeting",String.class,new Object());
        return toReturn;
    }

}
