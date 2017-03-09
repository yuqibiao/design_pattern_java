package com.yyyu.pattern.facade.define;

/**
 *外观对象
 */
public class Facade {

    public void test(){
        //---对子模块中业务逻辑同意管理
        AModule aModule = new AModuleImpl();
        BModule bModule = new BModuleImpl();
        aModule.testA();
        bModule.testB();
    }

}
