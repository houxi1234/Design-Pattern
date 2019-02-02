package com.hx.design.pattern.decorator;

/**
 * @author hx
 * @date 2019/2/2 19:52
 */
public class Source implements Sourcable {
    @Override
    public String operation() {
        System.out.println("原始方法");
        return null;
    }
}
