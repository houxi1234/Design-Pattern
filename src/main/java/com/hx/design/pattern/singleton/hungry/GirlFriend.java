package com.hx.design.pattern.singleton.hungry;

/**
 * @author hx
 * @date 2019/2/1 15:57
 */
public class GirlFriend {

    private static GirlFriend girlFriend = new GirlFriend();

    private GirlFriend(){}

    public static GirlFriend getInstance() {
        return girlFriend;
    }
}
