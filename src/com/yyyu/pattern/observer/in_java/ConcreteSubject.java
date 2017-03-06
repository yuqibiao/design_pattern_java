package com.yyyu.pattern.observer.in_java;

import java.util.Observable;

/**
 * Created by yyyu on 2017/3/6.
 */
public class ConcreteSubject extends Observable{

    public void notifyChange(Object obj){
        //---一定要记得调用这个
        this.setChanged();
        this.notifyObservers(obj);
    }

}
