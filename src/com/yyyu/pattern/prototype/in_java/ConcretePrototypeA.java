package com.yyyu.pattern.prototype.in_java;

/**
 * 利用java API实现
 */
public class ConcretePrototypeA implements Cloneable{
    private int num;
    public Object clone() {
        Object obj = null;
        try {
            //直接调用父类（Object）的clone方法就完成了复制
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
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
