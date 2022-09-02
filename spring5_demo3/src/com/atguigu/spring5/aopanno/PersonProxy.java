package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
//增强类优先级
@Order(1)
public class PersonProxy {
    //前置通知(@Before)
    @Before(value ="execution(* com.atguigu.spring5.aopanno.User.add(..))" )
    public void before(){
        System.out.println(" person before.....");
    }
}
