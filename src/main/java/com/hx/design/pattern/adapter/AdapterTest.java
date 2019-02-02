package com.hx.design.pattern.adapter;

/**
 * @author hx
 * @date 2019/2/2 19:25
 */
public class AdapterTest {
    public static void main(String[] args) {
        /////类适配器////////////////////////////////////////

        System.out.println("/////类适配器////////////////////////////////////////");
        OthersLogin othersLogin = new OthersLogin();
        //向下兼容
        othersLogin.login("123", "1222");
        System.out.println("----------------------");
        //扩展
        othersLogin.qqLogin("562066559");

        /////对象适配器////////////////////////////////////////

        System.out.println("/////对象适配器////////////////////////////////////////");
        OthersLoginTypeTwo typeTwo = new OthersLoginTypeTwo(new Login());
        //向下兼容
        typeTwo.getLogin().login("123", "1222");
        System.out.println("----------------------");
        //扩展
        typeTwo.login("562066559");
        System.out.println("----------------------");

    }
}
