package com.hx.design.pattern.adapter;

/**
 * 类适配器模式
 * @author hx
 * @date 2019/2/2 19:21
 */
public class OthersLoginTypeTwo {

    private Login login;

    public OthersLoginTypeTwo(Login login) {
        this.login = login;
    }

    public String qqLogin(String qq){
        System.out.println("QQ登录");
        return this.login(qq);
    }


    public String login(String uid){
        return login.login(uid, null);
    }

    public Login getLogin() {
        return login;
    }
}
