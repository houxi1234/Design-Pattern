package com.hx.design.pattern.factory.simple;

import com.hx.design.pattern.factory.IFood;

/**
 * @author hx
 * @date 2019/1/31 22:05
 */
public class SimpleFactory {

    //开-闭原则,对于修改,只需要在FoodsEnum添加
    public IFood getFood(String foodName){
        return FoodsEnum.getFood(foodName);
    }
}

