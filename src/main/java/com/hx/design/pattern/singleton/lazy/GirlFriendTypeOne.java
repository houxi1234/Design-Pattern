package com.hx.design.pattern.singleton.lazy;

/**
 * 同步锁方式实现单例
 * @author hx
 * @date 2019/2/1 16:33
 */
public class GirlFriendTypeOne {

    private static GirlFriendTypeOne girlFrend;

    private GirlFriendTypeOne(){}

    public static synchronized GirlFriendTypeOne getInstance() {

        if (null == girlFrend) {
            girlFrend = new GirlFriendTypeOne();
        }

        return girlFrend;
    }

}
