package com.hx.design.pattern.proxy.cglib;

/**
 * @author hx
 * @date 2019/2/2 15:42
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        PeopleC obj = (PeopleC) new CustomerB().getInstance(PeopleC.class);
        obj.buyHouse();
        System.out.println("---------------------------------");
        obj.rendHouse();
    }
}
