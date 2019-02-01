package com.hx.design.pattern.factory.simple;

/**
 * @author hx
 * @date 2019/2/1 13:57
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        String foodName = simpleFactory.getFood("面包").foodName();
        System.out.println(foodName);
    }
}
