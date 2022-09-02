package com.atguigu.spring5.bean;

import org.junit.Test;

//员工类
public class Emp {
    private String ename;
    private String gender;
//员工表示属于某一个部门，使用对象形式表示
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    @Test
    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
