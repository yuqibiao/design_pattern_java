package com.yyyu.pattern.prototype;

import com.yyyu.pattern.prototype.in_java.ConcretePrototypeA;

/**
 * 测试
 */
public class Client {


    public static void main(String[] args){
  /*   ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setNum(100);
        Prototype prototypeAClone = prototypeA.clone();
        System.out.println(prototypeAClone);

        ConcretePrototypeB prototypeB = new ConcretePrototypeB();
        prototypeB.setName("yu");
        Prototype prototypeBClone = prototypeB.clone();
        System.out.println(prototypeBClone);*/

        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setNum(101);
        System.out.println( prototypeA.clone());

    }

}
