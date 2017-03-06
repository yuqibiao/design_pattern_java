package com.yyyu.pattern.observer.in_java;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by yyyu on 2017/3/6.
 */
public class ConcreteObserverA implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("A接收到通知："+arg);
    }

}
