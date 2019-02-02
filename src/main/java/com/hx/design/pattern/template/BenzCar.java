package com.hx.design.pattern.template;

/**
 * @author hx
 * @date 2019/2/2 16:32
 */
public class BenzCar extends Car {
    @Override
    public void start() {
        System.out.println("奔驰 启动");
    }

    @Override
    public void stop() {
        System.out.println("奔驰 停止");
    }
}
