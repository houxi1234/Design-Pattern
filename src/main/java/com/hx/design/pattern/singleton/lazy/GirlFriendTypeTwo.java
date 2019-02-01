package com.hx.design.pattern.singleton.lazy;

/**
 * 双锁机制实现线程安全的单例
 * @author hx
 * @date 2019/2/1 16:47
 */
public class GirlFriendTypeTwo {
    private static volatile GirlFriendTypeTwo girlFrend;

    private GirlFriendTypeTwo(){}

    public static synchronized GirlFriendTypeTwo getInstance() {

        if (null == girlFrend) {
            synchronized (GirlFriendTypeTwo.class) {
                if (null == girlFrend) {
                    girlFrend = new GirlFriendTypeTwo();
                }
            }
        }
        return girlFrend;
    }
}
