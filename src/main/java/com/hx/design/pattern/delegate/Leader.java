package com.hx.design.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hx
 * @date 2019/2/2 17:47
 */
public class Leader{

    private static Map<String, IEmployee> map = new HashMap<>();

    static {
        map.put("登录", new EmployeeB());
        map.put("支付", new EmployeeC());
    }

    public String toDo(String todo) {
        IEmployee iEmployee = map.get(todo);
        iEmployee.toDo();
        return "开始做事";
    }
}
