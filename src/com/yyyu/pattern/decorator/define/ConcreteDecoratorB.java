package com.yyyu.pattern.decorator.define;

/**
 * 具体的修饰类B
 */
public class ConcreteDecoratorB extends Decorator{
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    @Override
    public void display() {
        super.display();
        addDecorator();
    }
    private void addDecorator() {
        System.out.println("添加了修饰B======");
    }
}
