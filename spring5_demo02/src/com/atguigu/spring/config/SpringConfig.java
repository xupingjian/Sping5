package com.atguigu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//作为配置类，替代xml配置文件
@ComponentScan(basePackages = "com.atguigu.spring")//等同育配置文件中的<context:component-scan base-package="com.atguigu.spring"></context:component-scan>
public class SpringConfig {
}
