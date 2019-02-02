package com.hx.design.pattern.template;

/**
 * @author hx
 * @date 2019/2/2 16:17
 */
public abstract class Car {

    abstract void start();

    abstract void stop();

    public final void exce(){
        this.start();
        this.stop();
    }


}
