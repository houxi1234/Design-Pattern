package com.hx.design.pattern.singleton.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author hx
 * @date 2019/2/1 18:08
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend s1 = null;
        GirlFriend s2 = GirlFriend.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("GirlFriend.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("GirlFriend.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (GirlFriend)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
