package com.hx.design.pattern.decorator;

/**
 * @author hx
 * @date 2019/2/2 19:53
 */
public class DecoratorB implements Sourcable {

    private DecoratorA decoratorA;

    public DecoratorB(DecoratorA decoratorA) {
        this.decoratorA = decoratorA;
    }

    @Override
    public String operation() {
        System.out.println("方法加强2");
        decoratorA.operation();
        return null;
    }
}
