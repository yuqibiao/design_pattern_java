package com.yyyu.pattern.factory.method;

/**
 * 产品A的创建工厂
 */
public class FactoryProductA extends Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
