package com.yyyu.pattern.singleton;

/**
 * double check 的懒汉模式
 *
 * Created by yyyu on 2017/3/5.
 */
public class Singleton1 {
    private static  Singleton1 mInstance ;
    private Singleton1(){
    }
    public static Singleton1 getInstance(){
        if(mInstance == null){//保证不是每次都需要synchronized判断
            synchronized (Singleton1.class){//保证多线程的访问安全
                if (mInstance == null){//保证只有一个对象实例
                    mInstance = new Singleton1();
                }
            }
        }
        return mInstance;
    }
    public void sayHello(){
        System.out.println("hello1");
    }

}
