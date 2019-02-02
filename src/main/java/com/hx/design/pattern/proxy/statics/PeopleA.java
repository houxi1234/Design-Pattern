package com.hx.design.pattern.proxy.statics;

/**
 * @author hx
 * @date 2019/2/1 21:22
 */
public class PeopleA implements Customer{

    @Override
    public String rendHouse() {
        System.out.println("PeopleA来租房子");
        return "";
    }

    @Override
    public String buyHouse() {
        System.out.println("PeopleA来买房");
        return "";
    }
}
