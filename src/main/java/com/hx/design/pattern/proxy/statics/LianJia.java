package com.hx.design.pattern.proxy.statics;

/**
 * @author hx
 * @date 2019/2/1 21:18
 */
public class LianJia {

    private Customer customer;

    public LianJia(Customer customer) {
        this.customer = customer;
    }

    public String rendHouse() {
        System.out.println("租房");
        customer.rendHouse();
        System.out.println("成功租房");
        return "";
    }

    public String buyHouse() {
        System.out.println("买房");
        customer.buyHouse();
        System.out.println("购买房子成功");
        return "";
    }
}
