package com.yyyu.pattern.decorator.define;

/**
 * 具体构件B
 */
public class ConcreteComponentB extends Component {
    @Override
    public void display() {
        System.out.println("执行业务逻辑B");
    }
}
