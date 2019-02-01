package com.hx.design.pattern.factory.function;

import com.hx.design.pattern.factory.Drink;
import com.hx.design.pattern.factory.IFood;

/**
 * @author hx
 * @date 2019/2/1 14:53
 */
public class DrinkFactory implements IFactory {
    @Override
    public IFood getFood() {
        return new Drink();
    }
}
