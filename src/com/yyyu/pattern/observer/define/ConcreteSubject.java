package com.yyyu.pattern.observer.define;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的观察目标
 */
public class ConcreteSubject extends Subject{

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyChange(String info) {
        for (Observer observer: observerList) {
            observer.update(info);
        }
    }
}
