package com.yyyu.pattern.decorator.after;

/**
 * 修饰类
 */
public class ComDecorator extends Component{

    private Component mComponent;

    public ComDecorator(Component component){
        this.mComponent = component;
    }

    @Override
    public void display() {
        mComponent.display();
    }

}
