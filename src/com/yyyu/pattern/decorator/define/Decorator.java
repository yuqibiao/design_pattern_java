package com.yyyu.pattern.decorator.define;

/**
 * 抽象装饰类
 */
public class Decorator extends Component{
    //---通过set方法或者构造方法获得构建的引用
    Component mComponent;
    public Decorator(Component component){
        this.mComponent = component;
    }
    @Override
    public void display() {
        //---具体的逻辑添加留到具体子类中实现
        this.mComponent.display();
    }
}
