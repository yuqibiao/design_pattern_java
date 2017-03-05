package com.yyyu.pattern.adapter;

/**
 * Adaptee :需要被适配的接口
 *
 */
public class Adaptee {

    //---已经被实现的方法，需要利用的方法
    public void specificFun(){
        System.out.println("已经被实现的方法，需要利用的方法");
    }

}
