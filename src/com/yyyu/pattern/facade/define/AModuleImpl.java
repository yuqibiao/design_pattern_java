package com.yyyu.pattern.facade.define;

/**
 * A模块的具体实现类
 */
public class AModuleImpl implements AModule {
    @Override
    public void testA() {
        System.out.println("A业务逻辑");
    }
}
