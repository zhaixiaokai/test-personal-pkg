package com.personal.test.spring.boot.demo;

import com.personal.test.spring.boot.demo.listener.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @ClassName SpringBootApp
 * @Author xiaokai
 * @Description
 * @Date 2019/6/26 4:09 PM
 * @Version 1.0
 **/
@SpringBootApplication
public class SpringBootApp {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootApp.class);
        app.addListeners(new ApplicationEventListener());
        app.run();
    }
}
