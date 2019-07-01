package com.personal.test.spring.boot.demo.annoation.selector;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;
import java.util.Set;

/**
 * @ClassName EnableMyAnnoationSelector
 * @Author xiaokai ImportSelector 的操作,可以参考https://blog.csdn.net/elim168/article/details/88131614
 * @Description
 * @Date 2019/6/27 4:44 PM
 * @Version 1.0
 **/

/**
 * 通过自定义注解解决一些bean define 的操作,可以将返回的String[]的类注册为bean
 */
public class EnableMyAnnoationSelector implements ImportSelector, BeanFactoryAware {
    private BeanFactory beanFactory;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(JSONObject.toJSONString(annotationMetadata));
        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(ComponentScan.class.getName());

        Set<String> typeSet = annotationMetadata.getAnnotationTypes();
        System.out.println(JSONObject.toJSONString(typeSet.toArray()));
        System.out.println("beanFactory:"+beanFactory);
        return new String[0];
    }
}
