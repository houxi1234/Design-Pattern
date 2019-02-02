package com.hx.design.pattern.proxy.jdk;

/**
 * @author hx
 * @date 2019/2/2 15:17
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        IPeople instance = (IPeople) new CustomerA().getInstance(new PeopleB());
        instance.buyHouse();
        System.out.println("------------------------------");
        instance.rendHouse();
    }
}
