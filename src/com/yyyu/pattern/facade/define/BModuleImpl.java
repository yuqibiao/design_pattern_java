package com.yyyu.pattern.facade.define;

/**
 * B模块的具体实现类
 */
public class BModuleImpl implements BModule {
    @Override
    public void testB() {
        System.out.println("B业务逻辑");
    }
}
