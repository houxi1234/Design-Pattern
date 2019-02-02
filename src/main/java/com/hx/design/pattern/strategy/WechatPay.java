package com.hx.design.pattern.strategy;

/**
 * @author hx
 * @date 2019/2/2 15:57
 */
public class WechatPay implements Pay {

    @Override
    public String pay(double amount) {
        return "微信支付" + amount + "元";
    }
}
