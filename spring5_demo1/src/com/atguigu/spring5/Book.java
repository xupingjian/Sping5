package com.atguigu.spring5;

import org.junit.Test;

/*使用set方法进行注入*/
public class Book {
    private String bname;
    private String bauthor;
    private String address;

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo(){
        System.out.println(bname+"::"+bauthor+"::"+address+"::"+id);
    }
}
