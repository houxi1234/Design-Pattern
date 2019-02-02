package com.hx.design.pattern.template;

/**
 * @author hx
 * @date 2019/2/2 16:30
 */
public class AutoCar extends Car {
    @Override
    public void start() {
        System.out.println("auto 启动");
    }

    @Override
    public void stop() {
        System.out.println("auto 停止");
    }
}
