package com.yyyu.pattern.composite.define;

/**
 * 叶子对象：不包括其它子对象
 */
public class Leaf extends  Component{
    @Override
    public void someOperation() {
        System.out.println(this);
    }
}
