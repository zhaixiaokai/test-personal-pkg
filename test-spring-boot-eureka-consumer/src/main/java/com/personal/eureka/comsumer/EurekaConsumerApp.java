package com.personal.eureka.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName EurekaConsumerApp
 * @Author xiaokai
 * @Description
 * @Date 2019/7/2 10:48 AM
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApp.class);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
