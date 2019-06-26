package com.personal.test.spring.boot.demo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @ClassName ApplicationEnvironmentPreparedEventListener
 * @Author xiaokai
 * @Description 目的是了解spring-boot的加载启动事件
 * @Date 2019/6/26 5:31 PM
 * @Version 1.0
 **/
public class ApplicationEventListener implements ApplicationListener {
    private Logger logger = LoggerFactory.getLogger(ApplicationEventListener.class);
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof ApplicationStartingEvent){
            logger.info("正在启动...");
        }else if(applicationEvent instanceof ApplicationEnvironmentPreparedEvent){
            logger.info("environment 就绪...准备加载Beandefinitions");
        }else if(applicationEvent instanceof ApplicationPreparedEvent){
            logger.info("Beandefinitions 加载完毕...");
        }else if(applicationEvent instanceof ApplicationStartedEvent){
            logger.info("context 已构建...");
        }else if(applicationEvent instanceof ApplicationReadyEvent){
            logger.info("应用已启动...");
        }else if(applicationEvent instanceof ApplicationFailedEvent){
            logger.info("应用启动失败...");
        }

    }
}
