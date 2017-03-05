package com.yyyu.pattern.template;

/**
 * AbstractClass：定义算法骨架
 */
public abstract  class AbstractClass {

    private String param;

    public AbstractClass(){
        init();
        param = getParam();
    }

    //---模板方法，定义算法骨架
    private void init() {
        initView();
        initListener();
    }

    //---原语操作1 （就是抽象操作，子类必须实现）
    protected abstract void initListener();
    //---原语操作2
    protected abstract void initView();
    //---钩子方法
    protected abstract String getParam();

}
