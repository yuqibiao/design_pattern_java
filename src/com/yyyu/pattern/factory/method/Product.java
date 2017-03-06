package com.yyyu.pattern.factory.method;

/**
 * 抽象产品类
 */
public abstract  class Product {
    public void create(){
        System.out.println("公共的创建方法");
    }
    //---业务逻辑
    public abstract  void display();
}
