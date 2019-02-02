package com.hx.design.pattern.strategy;

/**
 * @author hx
 * @date 2019/2/2 16:00
 */
public class Buy {

    public String buy(int payType, double amount) {
        return PayTypeEnum.getPay(payType).pay(amount);
    }
}
