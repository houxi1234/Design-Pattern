package com.hx.design.pattern.delegate;

/**
 * @author hx
 * @date 2019/2/2 17:45
 */
public class Boss {

    private Leader leader = new Leader();

    public void toDo(String toDo) {
        String s = leader.toDo(toDo);
        System.out.println(s);
    }
}
