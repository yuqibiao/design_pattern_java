package com.yyyu.pattern.observer;


import com.yyyu.pattern.observer.in_java.ConcreteObserverA;
import com.yyyu.pattern.observer.in_java.ConcreteObserverB;
import com.yyyu.pattern.observer.in_java.ConcreteSubject;

import java.util.Observable;
import java.util.Observer;

/**
 * 测试
 */
public class Client {
    public static void main(String[] args){
      /*  Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        Subject subject = new ConcreteSubject();
        subject.attach(observerA);
        subject.attach(observerB);
        subject.notifyChange("来自观察目标的信息");
        subject.detach(observerB);
        subject.notifyChange("B被注销了");*/

        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        ConcreteSubject observable = new ConcreteSubject();
        observable.addObserver(observerA);
        observable.addObserver(observerB);
        observable.notifyChange("来自观察目标的信息ss");
    }
}
