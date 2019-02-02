package com.hx.design.pattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author hx
 * @date 2019/2/2 15:08
 */
public class CustomerA implements InvocationHandler {

    private IPeople people;

    public Object getInstance(IPeople people){
        this.people = people;
        Class<?> clazz = people.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理顾客信息");
        method.invoke(this.people, args);
        System.out.println("处理顾客信息");
        return null;
    }
}
