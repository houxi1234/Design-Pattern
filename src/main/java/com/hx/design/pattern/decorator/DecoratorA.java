package com.hx.design.pattern.decorator;

/**
 * @author hx
 * @date 2019/2/2 19:53
 */
public class DecoratorA implements Sourcable {

    private Source source;

    public DecoratorA(Source source) {
        this.source = source;
    }

    @Override
    public String operation() {
        System.out.println("方法加强1");
        source.operation();
        return null;
    }
}
