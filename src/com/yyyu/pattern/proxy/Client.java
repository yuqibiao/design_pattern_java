package com.yyyu.pattern.proxy;

import com.yyyu.pattern.proxy.dynamic_proxy.DynamicInvokeHandler;
import com.yyyu.pattern.proxy.dynamic_proxy.RealSubject;
import com.yyyu.pattern.proxy.dynamic_proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * 测试
 */
public class Client {

    public static void main(String[] args){
       /* Proxy proxy = new Proxy(new RealSubject());
        proxy.request();*/

       /* ValidateUser validateUser = new ValidateUser();
        InfoLogger infoLogger = new InfoLogger();
        Searcher searcher = new RealSearcher();
        Searcher proxy = new ProxySearcher(searcher , validateUser  , infoLogger);
        proxy.doSearcher(11 , "yu");
        proxy.doSearcher(1 , "yu");*/

       Subject realSubject = new RealSubject();
        DynamicInvokeHandler handler = new DynamicInvokeHandler(realSubject);

        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader()//classload
                , realSubject.getClass().getInterfaces()//subject所实现的接口
                , handler//InvocationHandler实例
        );
        System.out.println("class name===="+subject.getClass().getName());
        subject.sayHello();
        subject.request(1);

    }

}
