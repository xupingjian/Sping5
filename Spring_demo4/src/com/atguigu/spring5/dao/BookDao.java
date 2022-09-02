package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;

import java.util.List;

public interface BookDao {
    //添加的方法
    void add(Book book);
    //修改的方法
    void updateBook(Book book);
    //删除的方法
    void deleteBook(String id);
    //查询表记录数
    int seletCount();
    //查询表记录数(返回一个对象)
    Book findBookInfo(String id);
    //查询表记录数(返回集合)
    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);
}
