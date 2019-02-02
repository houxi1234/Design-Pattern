package com.hx.design.pattern.adapter;

/**
 * @author hx
 * @date 2019/2/2 18:08
 */
public class Login implements ILogin{

    @Override
    public String login(String uid, String pwd) {
        System.out.println("账号:" + uid + "登录成功");
        return "登录成功";
    }
}
