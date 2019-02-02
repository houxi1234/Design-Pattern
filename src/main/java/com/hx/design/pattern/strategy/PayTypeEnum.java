package com.hx.design.pattern.strategy;

/**
 * @author hx
 * @date 2019/2/2 16:02
 */
public enum PayTypeEnum {

    ALI_PAY(1,new AliPay()),WECHAT_PAY(2,new WechatPay());

    private int index;
    private Pay pay;
    PayTypeEnum(int index, Pay pay) {
        this.index = index;
        this.pay = pay;
    }

    public static Pay getPay(int index) {
        for (PayTypeEnum typeEnum : PayTypeEnum.values()) {
            if (typeEnum.index == index) {
                return typeEnum.pay;
            }
        }
        return null;
    }
}
