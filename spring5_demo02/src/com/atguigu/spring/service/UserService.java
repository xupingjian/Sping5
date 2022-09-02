package com.atguigu.spring.service;

import com.atguigu.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value="userService")//等价<bean id="userService" class="包类路径">
//注解里面value属性值可以省略不写，默认是类名称，首字母小写
public class UserService {
    //value注解
    @Value(value = "abc")
    private String name;

    //定义dao类型属性(在属性上面添加注解就不需要和以前一样添加set方法)
    @Autowired
    @Qualifier(value = "userDaoImpl1")
    private UserDao userDao;

    public void add(){
        System.out.println("serviceadd..."+name);
        userDao.add();
    }
}
