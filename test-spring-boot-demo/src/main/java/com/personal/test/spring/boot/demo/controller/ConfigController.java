package com.personal.test.spring.boot.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.personal.test.spring.boot.demo.config.AppConfig;
import com.personal.test.spring.boot.demo.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ConfigController
 * @Author xiaokai
 * @Description
 * @Date 2019/6/27 9:44 AM
 * @Version 1.0
 **/
@RestController
public class ConfigController {

    @Autowired
    MyConfig config;
    @Autowired
    AppConfig appConfig;

    @RequestMapping("getMyConfig")
    public String getMyConfig() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", config.getName());
        map.put("password", config.getPassword());
        return JSONObject.toJSONString(map);
    }

    @RequestMapping("getAppConfig")
    public String getAppConfig() {
        System.out.println(appConfig.getName());
        System.out.println(appConfig.getId());
        return JSONObject.toJSONString(appConfig.getName());
    }

    @RequestMapping("getAppConfigBean")
    public AppConfig getAppConfigBean(){
        return this.appConfig;
    }
}
