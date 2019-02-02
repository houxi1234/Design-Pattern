package com.hx.design.pattern.proxy.statics;

/**
 * @author hx
 * @date 2019/2/1 21:30
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        LianJia lianJia = new LianJia(new PeopleA());
        lianJia.buyHouse();
        lianJia.rendHouse();
    }
}
