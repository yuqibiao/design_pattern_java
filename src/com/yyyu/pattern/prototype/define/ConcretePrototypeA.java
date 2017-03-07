package com.yyyu.pattern.prototype.define;

/**
 * 具体原型类
 */
public class ConcretePrototypeA implements Prototype{

    private int num;

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        concretePrototypeA.setNum(getNum());
        return concretePrototypeA;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString()+"  num:"+getNum();
    }
}
