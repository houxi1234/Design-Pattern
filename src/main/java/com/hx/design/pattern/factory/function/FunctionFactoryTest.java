package com.hx.design.pattern.factory.function;

import com.hx.design.pattern.factory.IFood;

/**
 * @author hx
 * @date 2019/2/1 14:55
 */
public class FunctionFactoryTest {
    public static void main(String[] args) {
        IFactory factory = new DrinkFactory();
        IFood food = factory.getFood();
        System.out.println(food.foodName());
    }
}
