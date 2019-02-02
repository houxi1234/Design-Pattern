package com.hx.design.pattern.decorator;

/**
 * @author hx
 * @date 2019/2/2 19:53
 */
public class DecoratorTest {

    public static void main(String[] args) {
        //io流就是典型的装饰者模式
        new DecoratorB(new DecoratorA(new Source())).operation();
    }
}
