package com.yyyu.pattern.state.define;

/**
 * 具体的状态处理类：上下文相关状态的具体处理
 */
public class ConcreateStateA implements State{
    @Override
    public void handle(String simplePram) {
        System.out.println("状态A的处理==="+simplePram);
    }
}
