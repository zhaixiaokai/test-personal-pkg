package com.personal.test.spring.boot.demo.annoation;

import com.personal.test.spring.boot.demo.annoation.selector.EnableMyAnnoationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
// 通过@Import制定bean加载的规则
@Import(EnableMyAnnoationSelector.class)

/**
 * 自定义一个Enable***注解
 */
public @interface EnableMyAnnoation {

}
