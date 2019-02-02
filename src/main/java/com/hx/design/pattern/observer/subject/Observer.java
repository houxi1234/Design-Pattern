package com.hx.design.pattern.observer.subject;

import com.hx.design.pattern.observer.core.Event;

/**
 * @author hx
 * @date 2019/2/2 15:42
 */
public class Observer {

    public void advice(Event e){
        System.out.println("=========触发事件，打印日志========\n" + e);
    }

}
