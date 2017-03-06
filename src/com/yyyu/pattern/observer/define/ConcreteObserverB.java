package com.yyyu.pattern.observer.define;

/**
 * 观察者B
 */
public class ConcreteObserverB extends Observer{
    @Override
    public void update(String  info) {
        System.out.println("B接受了通知==="+info);
    }
}
