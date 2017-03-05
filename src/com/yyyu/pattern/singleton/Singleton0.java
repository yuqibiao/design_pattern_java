package com.yyyu.pattern.singleton;

/**
 * 饿汉模式
 *
 * Created by yyyu on 2017/3/5.
 */
public class Singleton0 {

    private static Singleton0 mInstance = new Singleton0();

    private Singleton0(){

    }

    public static Singleton0 getInstance(){
        return mInstance;
    }

    public void sayHello(){
        System.out.println("hello0");
    }

}
