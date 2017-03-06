package com.yyyu.pattern.observer.define;

/**
 * 观察目标的抽象类：接受改变
 */
public  abstract  class Subject {

    public abstract  void attach(Observer observer);
    public abstract void detach(Observer observer);
    public abstract  void notifyChange(String info);

}
