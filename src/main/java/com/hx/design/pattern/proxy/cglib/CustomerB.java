package com.hx.design.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author hx
 * @date 2019/2/2 15:38
 */
public class CustomerB implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){

        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return  enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理顾客信息");
        methodProxy.invokeSuper(o, objects);
        System.out.println("处理顾客信息");
        return null;
    }
}
