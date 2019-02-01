package com.hx.design.pattern.factory.simple;

import com.hx.design.pattern.factory.Bread;
import com.hx.design.pattern.factory.Drink;
import com.hx.design.pattern.factory.IFood;

/**
 * @author hx
 * @date 2019/2/1 14:01
 */
public enum FoodsEnum {
    bread("面包", new Bread()),drink("饮料", new Drink());


    private String name;
    private IFood food;

    FoodsEnum(String name, IFood food) {
        this.name = name;
        this.food = food;
    }

    public static IFood getFood(String foodName) {
        for (FoodsEnum foodsEnum: FoodsEnum.values()) {
            if (foodsEnum.getName().equals(foodName)) {
                return foodsEnum.getFood();
            }
        }
        return null;
    }

    private IFood getFood() {
        return food;
    }

    private String getName() {
        return name;
    }
}
