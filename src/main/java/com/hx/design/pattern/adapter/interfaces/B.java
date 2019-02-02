package com.hx.design.pattern.adapter.interfaces;

/**
 * @author hx
 * @date 2019/2/2 19:39
 */
public class B extends Adapter{
    @Override
    public void a() {
        System.out.println("我是B中的a方法");
    }

    @Override
    public void b() {
        System.out.println("我是B中的b方法");
    }
    //其他方法不需要使用
}
