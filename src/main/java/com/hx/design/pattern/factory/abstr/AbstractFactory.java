package com.hx.design.pattern.factory.abstr;

import com.hx.design.pattern.factory.IFood;

/**
 * @author hx
 * @date 2019/2/1 15:17
 */
public abstract class AbstractFactory {

    /**
     * 公用的方法
     * @return
     */
    public String getFactoryAdress() {
        return "四川省绵阳市";
    }

    abstract IFood getDrink();

    abstract IFood getBread();
}
