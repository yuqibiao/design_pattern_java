package com.yyyu.pattern.composite;

import com.yyyu.pattern.composite.define.Component;
import com.yyyu.pattern.composite.define.Composite;
import com.yyyu.pattern.composite.define.Leaf;

/**
 *测试
 */
public class Client {
    public static void main(String[] args){

        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component composite = new Composite();
        composite.addChild(leaf1);
        composite.addChild(leaf2);
        leaf1.someOperation();
        composite.someOperation();
    }

}
