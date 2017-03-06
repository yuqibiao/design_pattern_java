package com.yyyu.pattern.builder;

/**
 * 具体的构造类(可能会有多个)
 */
public class ConcreteBuilder extends  Builder {

    @Override
    public void buildPartA() {
        mProduct.setPartA("1.构建partA");
    }

    @Override
    public void buildPartB() {
        mProduct.setPartB("2.构建partB");
    }

    @Override
    public void buildPartC() {
        mProduct.setPartC("3.构建partC");
    }

}
