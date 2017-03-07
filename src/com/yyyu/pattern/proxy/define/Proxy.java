package com.yyyu.pattern.proxy.define;

/**
 * 代理对象
 */
public class Proxy implements Subject{

    private Subject mSubject;

    public Proxy(Subject subject){
        this.mSubject = subject;
    }

    @Override
    public void request() {
        proRequest();
        mSubject.request();
        postRequest();
    }

    private void proRequest(){
        System.out.println("在request之前添加操作");
    }

    private void postRequest(){
        System.out.println("在request之后添加操作");
    }

}
