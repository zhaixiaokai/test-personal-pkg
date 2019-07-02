package com.personal.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaProviderApp
 * @Author xiaokai
 * @Description
 * @Date 2019/7/2 9:32 AM
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApp.class);
    }
}
