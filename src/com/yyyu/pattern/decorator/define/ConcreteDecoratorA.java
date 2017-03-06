package com.yyyu.pattern.decorator.define;

/**
 * 具体的修饰类A
 */
public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    @Override
    public void display() {
        super.display();
        addDecorator();
    }
    private void addDecorator() {
        System.out.println("添加了修饰A======");
    }
}
