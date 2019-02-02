package com.hx.design.pattern.strategy;

/**
 * @author hx
 * @date 2019/2/2 15:57
 */
public class StrategyTest {
    public static void main(String[] args) {
        String buy = new Buy().buy(2, 10000);
        System.out.println(buy);
    }
}
