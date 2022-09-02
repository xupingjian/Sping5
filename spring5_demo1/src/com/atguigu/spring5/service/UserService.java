package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;
import org.junit.Test;

public class UserService {
    //创建UserDao类型属性，生成set方法
    private  UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Test
    public void add(){
        System.out.println("service add....");
        userDao.update();
    }
}
