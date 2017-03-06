package com.yyyu.pattern.decorator.define;

/**
 * 具体构件A
 */
public class ConcreteComponentA extends Component {
    @Override
    public void display() {
        System.out.println("执行业务逻辑A");
    }
}
