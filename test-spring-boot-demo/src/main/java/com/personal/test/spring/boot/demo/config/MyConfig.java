package com.personal.test.spring.boot.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName ApplicationConfig
 * @Author xiaokai
 * @Description
 * @Date 2019/6/27 9:25 AM
 * @Version 1.0
 **/
@Component
@Configuration
public class MyConfig {

    @Value("${my.username}")
    private String name;
    @Value("${my.password}")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
