package com.yyyu.pattern.singleton;

/**
 * 使用枚举来实现单例
 *
 * Created by yyyu on 2017/3/5.
 */
public enum  Singleton3 {
    /**
     * 定义一个枚举元素，它代表的就是Singleton3对象
     */
    mInstance;
    public void sayHello(){
        System.out.println("hello1");
    }
}
