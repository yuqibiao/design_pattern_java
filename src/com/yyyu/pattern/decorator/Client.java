package com.yyyu.pattern.decorator;

import com.yyyu.pattern.decorator.after.*;

/**
 * 使用
 */
public class Client {
    public static void main(String[] args){
       /* Component componentA = new ConcreteComponentA();
        Decorator decoratorA = new ConcreteDecoratorA(componentA);
        decoratorA.display();

        Decorator decoratorB = new ConcreteDecoratorB(componentA);
        decoratorB.display();*/

        Component window = new WindowCom();
        ComDecorator scrollbar = new ComScrollBarDecorator(window);
        ComDecorator balckBorderAndScrollbarWindow = new ComBlackBorderDecorator(scrollbar);

        balckBorderAndScrollbarWindow.display();

    }
}
