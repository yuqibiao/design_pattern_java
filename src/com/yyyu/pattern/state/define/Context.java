package com.yyyu.pattern.state.define;

/**
 * 上下文：维护一个具体处理状态的实例
 */
public class Context {

    State mState;

    public void setmState(State mState) {
        this.mState = mState;
    }

    public void request(String simplePram){
        mState.handle(simplePram);
    }

}
