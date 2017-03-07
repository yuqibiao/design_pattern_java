package com.yyyu.pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yyyu on 2017/3/7.
 *
 * 实现动态代码 不需要让Proxy和Subject实现相同的接口
 *
 */
public class DynamicInvokeHandler implements InvocationHandler{

    private Object subject;

    public DynamicInvokeHandler(Object subject ){
        this.subject = subject;
    }

    /**
     *
     * @param proxy :动态生成的Subject代理对象
     * @param method:Subject中调用的方法
     * @param args:Subject调用方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("方法名称===="+method.getName());
        System.out.println("proxy===="+proxy.getClass().getName());

        String methodName = method.getName();
        if ("sayHello".equalsIgnoreCase(methodName)){
            System.out.println("说hello之前");
            method.invoke(subject , args);
            System.out.println("说hello之前");
        }else if ("request".equalsIgnoreCase(methodName)){

            System.out.println("方法的参数index===="+args[0]);

            System.out.println("发request请求之前");
            method.invoke(subject , args);
            System.out.println("发request请求之后");
        }

        return null;
    }

}
