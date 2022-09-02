package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService user = context.getBean("bookService", BookService.class);
/*        //  添加
        Book book = new Book();
        book.setUserid("2");
        book.setUsername("hanhan");
        book.setUstatus("ok");

        user.addBook(book);
        //根据id修改
        Book book1 = new Book();
        book1.setUserid("1");
        book1.setUsername("hello");
        book1.setUstatus("nice");

        user.updateBook(book1);
//        //根据id删除
//        user.deleteBook("2");
//        //查询返回某个值
//        int count = user.findCount();
//        System.out.println(count);
        //查询表记录数(返回一个对象)
        Book one = user.findOne("1");
        System.out.println(one);
        List<Book> all = user.findAll();
        System.out.println(all);*/

/*
        //批量添加
        List<Object[]> list = new ArrayList<>();
        Object[] o1 = {"3","python","a"};
        Object[] o2 = {"4","c++","b"};
        Object[] o3 = {"5","java","c"};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        //调用批量添加
        user.batchAdd(list);
*/

        //批量修改
        List<Object[]> list = new ArrayList<>();
        Object[] o1 = {"pythonsbvwdf","a","3"};
        Object[] o2 = {"c++jele","b","4"};
        Object[] o3 = {"javafvev","c","5"};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        user.batchUpdate(list);
    }



}
