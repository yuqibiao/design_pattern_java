package com.yyyu.pattern.strategy.define;

/**
 * 环境类：使用算法的角色
 */
public class Context {

    private Strategy mStrategy;

    public void setStrategy(Strategy strategy){
        this.mStrategy = strategy;
    }

    public String algorithm(){
        return mStrategy.algorithm();
    }

}
