package com.yyyu.pattern.factory.method;

/**
 * 具体的产品对象A
 */
public class ConcreteProductA extends Product{
    @Override
    public void display() {
        System.out.println("display-----A");
    }
}
