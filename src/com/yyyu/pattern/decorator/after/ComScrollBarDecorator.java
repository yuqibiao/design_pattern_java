package com.yyyu.pattern.decorator.after;

/**
 * 添加Scrollbar修饰
 */
public class ComScrollBarDecorator extends ComDecorator{

    public ComScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        addScrollbar();
        super.display();
    }

    private void addScrollbar() {
        System.out.println("添加Scrollbar========");
    }


}
