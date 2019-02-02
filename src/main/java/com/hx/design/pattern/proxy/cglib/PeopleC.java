package com.hx.design.pattern.proxy.cglib;

/**
 * @author hx
 * @date 2019/2/2 15:38
 */
public class PeopleC {

    public String rendHouse() {
        System.out.println("我是顾客，我要找房子");
        return null;
    }

    public String buyHouse() {
        System.out.println("我是顾客，我要买房子");
        return null;
    }
}
