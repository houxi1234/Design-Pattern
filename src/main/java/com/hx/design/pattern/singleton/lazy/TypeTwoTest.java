package com.hx.design.pattern.singleton.lazy;

import java.util.concurrent.CountDownLatch;

/**
 * @author hx
 * @date 2019/2/1 16:52
 */
public class TypeTwoTest {

    private static final int times = 100;
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(times);
        //并发测试
        for (int i = 0; i < times; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        latch.await();
                        GirlFriendTypeTwo instance = GirlFriendTypeTwo.getInstance();
                        System.out.println(instance);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
            latch.countDown();
        }
    }
}
