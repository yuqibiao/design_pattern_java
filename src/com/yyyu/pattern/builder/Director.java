package com.yyyu.pattern.builder;

/**
 * 指挥类
 */
public class Director {

    private Builder mBuilder;

    public Director(Builder builder){
        this.mBuilder = builder;
    }

    //---封装构造步骤（这里按 part ABC 的顺序）
    public Product construct(){
        mBuilder.buildPartA();
        mBuilder.buildPartB();
        mBuilder.buildPartC();
        return mBuilder.getProduct();
    }

}
