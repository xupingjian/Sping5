package com.atguigu.spring5.test;

import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

public class TestBook {
    //函数式风格创建对象，交给spring进行管理
    @Test
    public void testGenericApplicationContext(){
        //1 创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2 调用context的方法对象注册
        context.refresh();
        context.registerBean(User.class,()->new User());
        //3 获取在spring注册的对象
        User user = context.getBean("com.atguigu.spring5.test.User", User.class);
        System.out.println(user);
    }
}
