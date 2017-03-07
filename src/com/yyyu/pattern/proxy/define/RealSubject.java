package com.yyyu.pattern.proxy.define;

/**
 *真实主题角色
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("subject 执行业务逻辑");
    }
}
