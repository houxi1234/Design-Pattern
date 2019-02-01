package com.hx.design.pattern.singleton.serializable;

import java.io.Serializable;

/**
 * @author hx
 * @date 2019/2/1 18:05
 */
public class GirlFriend implements Serializable {

    private static GirlFriend girlFriend = new GirlFriend();

    private GirlFriend(){}

    public static GirlFriend getInstance() {
        return girlFriend;
    }
    private  Object readResolve(){
        return  girlFriend;
    }
}
