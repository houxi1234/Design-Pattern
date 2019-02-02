package com.hx.design.pattern.strategy;

/**
 * @author hx
 * @date 2019/2/2 15:55
 */
public class AliPay implements Pay {

    @Override
    public String pay(double amount) {
        return "支付宝付款" + amount + "万元";
    }
}
