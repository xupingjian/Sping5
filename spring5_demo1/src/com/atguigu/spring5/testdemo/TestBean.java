package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestBean {
    @Test
    public void test()

    {
        //      1.  加载Spring配置文件
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\F413Y\\IdeaProjects\\spring5_demo1\\src\\com\\atguigu\\spring5\\bean2.xml");
        //        2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
//        等同于User user = context.getBean("user",User.class)
        userService.add();
    }
    @Test
    public void test2()

    {
        //      1.  加载Spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //        2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
//        等同于User user = context.getBean("user",User.class)
        emp.add();
    }
}