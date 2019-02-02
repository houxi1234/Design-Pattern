package com.hx.design.pattern.delegate;

/**
 * @author hx
 * @date 2019/2/2 17:50
 */
public class EmployeeC implements IEmployee{
    @Override
    public void toDo() {
        System.out.println("我是做支付的人");
    }
}
