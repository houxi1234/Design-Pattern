package com.hx.design.pattern.proxy.jdk;

/**
 * @author hx
 * @date 2019/2/2 15:08
 */
public class PeopleB implements IPeople {
    @Override
    public String rendHouse() {
        System.out.println("我是顾客，我要找房子");
        return null;
    }

    @Override
    public String buyHouse() {
        System.out.println("我是顾客，我要买房子");
        return null;
    }
}
