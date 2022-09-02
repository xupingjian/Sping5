package com.atguigu.spring5.test;

import com.atguigu.spring5.aopanno.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetAop {
    @Test
    public void testAopAno(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
