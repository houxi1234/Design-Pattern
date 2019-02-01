package com.hx.design.pattern.singleton.lazy;

/**
 * 内部类方式实现单例
 * @author hx
 * @date 2019/2/1 16:53
 */
public class GirlFriendTypeThree {

    private GirlFriendTypeThree(){}

    public static GirlFriendTypeThree getInstance() {
        return GirlFrendHolder.girlFrend;
    }
    private static class GirlFrendHolder{
        private static GirlFriendTypeThree girlFrend = new GirlFriendTypeThree();
    }
}
