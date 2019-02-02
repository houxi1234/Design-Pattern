package com.hx.design.pattern.delegate;

/**
 * @author hx
 * @date 2019/2/2 17:49
 */
public class EmployeeB implements IEmployee{
    @Override
    public void toDo() {
        System.out.println("我是做登录的人");
    }
}
