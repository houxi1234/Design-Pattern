package com.hx.design.pattern.singleton.regiest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册制实现单例
 * @author hx
 * @date 2019/2/1 17:11
 */
public class GirlFriendTypeTwo {

    private static Map<String, Object> register = new ConcurrentHashMap<>();

    private GirlFriendTypeTwo() {
    }

    public static Object getBean(String className) {
        if (register.containsKey(className)) {
            return register.get(className);
        }
        Object instance = null;
        try {
            instance = Class.forName(className).newInstance();
            register.put(className, instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return register.get(className);
    }

}
