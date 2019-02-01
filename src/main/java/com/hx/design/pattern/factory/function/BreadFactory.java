package com.hx.design.pattern.factory.function;

import com.hx.design.pattern.factory.Bread;
import com.hx.design.pattern.factory.IFood;

/**
 * @author hx
 * @date 2019/2/1 14:52
 */
public class BreadFactory implements IFactory {
    @Override
    public IFood getFood() {
        return new Bread();
    }
}
