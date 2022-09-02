package com.atguigu.spring5.test;

import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//指定单元测试框架版本
@ContextConfiguration("classpath:bean1.xml")//加载配置文件
public class JTest4 {
    //直接利用注解得到userService对象
    @Autowired
    private UserService userService;
    @Test//junit4
    public void test1(){
        userService.accountMoney();
    }
}
