package com.yyyu.pattern.builder;

/**
 * 最终要构建的复杂对象
 * 所谓复杂对象简单来说，复杂对象是指那些包含多个成员属性的对象
 */
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        if(partA==null){
            throw new UnsupportedOperationException("够着partB前必须构建partA");
        }
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        if(partB==null){
            throw new UnsupportedOperationException("够着partBC前必须构建partB");
        }
        this.partC = partC;
    }

    @Override
    public String toString() {
        return ""+partA+""+partB+""+partC;
    }
}
