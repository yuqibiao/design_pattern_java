package com.yyyu.pattern.composite.define;

/**
 * 抽象的组件对象
 */
public abstract  class Component {
    public abstract  void someOperation();
    public void addChild(Component child){
        //---提供默认的实现抛出异常
        throw  new UnsupportedOperationException("Leaf不能添加子对象");
    }
    public void removeChild(Component child){
        throw  new UnsupportedOperationException("Leaf不支持移除子对象");
    }
    public Component getChild (int index){
        throw  new UnsupportedOperationException("Leaf不支持此项操作");
    }
}
