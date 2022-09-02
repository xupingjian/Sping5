package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class TestSpring5 {
    @Test
    public void testAdd() {
//      1.  加载Spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        2.获取配置创建的对象
        Book book = (Book) context.getBean("book");
//        等同于User user = context.getBean("user",User.class)
        System.out.println(book);
        book.testDemo();


    }

}
