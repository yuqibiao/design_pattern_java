package com.yyyu.pattern.observer.define;

/**
 * 观察者A
 */
public class ConcreteObserverA extends Observer{
    @Override
    public void update(String  info) {
        System.out.println("A接受了通知==="+info);
    }
}
