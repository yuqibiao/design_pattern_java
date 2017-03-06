package com.yyyu.pattern.builder;

/**
 *构建抽象类 | 接口，以构建一个txt文件和一个xml文件为例
 */
public abstract  class  Builder {

    Product mProduct = new Product();

    abstract  void buildPartA();
    abstract  void buildPartB();
    abstract  void buildPartC();

    public Product getProduct() {
        return mProduct;
    }
}
