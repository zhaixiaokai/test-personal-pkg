package com.personal.eureka.provider.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SrvController
 * @Author xiaokai
 * @Description
 * @Date 2019/7/2 9:34 AM
 * @Version 1.0
 **/
@RestController
public class SrvController {

    @RequestMapping("greeting")
    private String sayHello() {
        Map<String, String> ret = new HashMap<String,String>();
        ret.put("name","personal");
        ret.put("greeting","hello 2");
        return JSONObject.toJSONString(ret);
    }
}
