package com.hx.design.pattern.factory.abstr;

/**
 * @author hx
 * @date 2019/2/1 15:24
 */
public class FoodFactoryTest {

    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        System.out.println(foodFactory.getFactoryAdress());
        System.out.println(foodFactory.getBread().foodName());
        System.out.println(foodFactory.getDrink().foodName());
    }
}
