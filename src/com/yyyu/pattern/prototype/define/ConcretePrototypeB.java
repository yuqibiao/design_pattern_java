package com.yyyu.pattern.prototype.define;

/**
 * 具体原型类
 */
public class ConcretePrototypeB implements Prototype{

    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototypeB concretePrototypeB = new ConcretePrototypeB();
        concretePrototypeB.setName(getName());
        return concretePrototypeB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  super.toString()+" name:"+getName();
    }

}
