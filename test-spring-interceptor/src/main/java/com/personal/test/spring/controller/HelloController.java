package com.personal.test.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @ClassName HelloController
 * @Author xiaokai
 * @Description
 * @Date 2019/6/26 2:26 PM
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String sayHello(){
        return "hello";
    }
}
