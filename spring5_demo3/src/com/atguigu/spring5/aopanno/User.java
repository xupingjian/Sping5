package com.atguigu.spring5.aopanno;

import org.springframework.stereotype.Component;

//被增强类
@Component(value = "user")
public class User {
    public void add(){
        System.out.println("add 。。。。。");
    }
}
