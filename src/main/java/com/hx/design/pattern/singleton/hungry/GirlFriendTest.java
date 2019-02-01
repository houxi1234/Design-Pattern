package com.hx.design.pattern.singleton.hungry;

/**
 * @author hx
 * @date 2019/2/1 16:04
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}
