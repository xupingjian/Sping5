package com.atguigu.spring5.test;

import com.atguigu.spring5.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@ExtendWith(SpringExtension.class)//指定单元测试框架版本
@ContextConfiguration("classpath:bean1.xml")//加载配置文件

/*上面两个注解可以用一个复合注解来代替@SpringJUnitConfig(locations ="classpath:bean1.xml" )*/
public class JTest5 {
    //直接利用注解得到userService对象
    @Autowired
    private UserService userService;
    @Test//junit5
    public void test1(){
        userService.accountMoney();
    }
}
