package com.yyyu.pattern.adapter;


/**
 *Adapter: 去适配Adaptee
 */
public class Adapter implements Target{

    private Adaptee mAdaptee;
    public Adapter(Adaptee adaptee){
        mAdaptee = adaptee;
    }

    @Override
    public void targetFun() {
        mAdaptee.specificFun();
    }
}
