package com.personal.test.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RootController
 * @Author xiaokai
 * @Description
 * @Date 2019/6/26 4:21 PM
 * @Version 1.0
 **/
@RestController
public class RootController {

    @RequestMapping("hello")
    public String sayHello(){
        return "hello";
    }
    @RequestMapping("bye")
    public String sayBye(){
        return "bye";
    }

}
