package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
@Transactional(readOnly = false,timeout = -1, propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {
    //注入dao
    @Autowired
    @Qualifier(value = "impl")
    private UserDao userDao;
    //转账的方法
    public void accountMoney(){
        //lucy少100
        userDao.reduceMoney();

        //模拟异常
        int i=100/0;
        //mary多100
        userDao.addMoney();
    }
}
