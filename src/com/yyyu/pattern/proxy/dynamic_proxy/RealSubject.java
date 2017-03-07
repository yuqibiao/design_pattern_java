package com.yyyu.pattern.proxy.dynamic_proxy;

/**
 * Created by yyyu on 2017/3/7.
 */
public class RealSubject implements Subject{
    @Override
    public void sayHello() {
        System.out.println("hello 动态代理");
    }

    @Override
    public void request(int index) {
        System.out.println("发出了请求");
    }
}
