package com.personal.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName register
 * @Author xiaokai
 * @Description
 * @Date 2019/7/1 5:37 PM
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisterServer {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EurekaRegisterServer.class);
        app.run();
    }
}
