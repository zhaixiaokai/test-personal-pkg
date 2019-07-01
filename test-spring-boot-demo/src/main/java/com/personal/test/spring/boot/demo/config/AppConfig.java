package com.personal.test.spring.boot.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @ClassName AppConfig
 * @Author xiaokai
 * @Description  读取配置文件,方法2:ConfigurationProperties
 * @Date 2019/6/27 9:58 AM
 * @Version 1.0
 **/


/**
 * 说明:  用ConfigurationProperties读取配置文件时,
 *          可以利用@NotNull@NotEmpty等注解进行校验
 */
@Component
@ConfigurationProperties(prefix = "app")
@Validated
public class AppConfig {
    @NotNull
    Long id;
    @NotEmpty
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
