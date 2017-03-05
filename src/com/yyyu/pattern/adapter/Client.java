package com.yyyu.pattern.adapter;

/**
 * Client : 目标客户端
 */
public class Client {

    public static void main(String[] args){
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.targetFun();
    }

}
