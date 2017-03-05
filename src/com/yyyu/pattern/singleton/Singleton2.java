package com.yyyu.pattern.singleton;

/**
 * 使用类级内部静态类实现单例
 *
 * Created by yyyu on 2017/3/5.
 */
public class Singleton2 {
    private  Singleton2(){
    }
    /**
     * 类级内部静态类只有在使用的时候才会被加载
     */
    private static class SingletonHolder{
        private static Singleton2 mInstance = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return SingletonHolder.mInstance;
    }
}
