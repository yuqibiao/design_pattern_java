package com.yyyu.pattern.decorator.after;

/**
 * BlackBorder修饰
 */
public class ComBlackBorderDecorator extends ComDecorator{

    public ComBlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        addBlackBorder();
        super.display();
    }

    private void addBlackBorder() {
        System.out.println("添加黑边框====");
    }
}
