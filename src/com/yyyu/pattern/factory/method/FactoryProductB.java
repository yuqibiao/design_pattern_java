package com.yyyu.pattern.factory.method;

/**
 * 产品B的创建工厂
 */
public class FactoryProductB extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
