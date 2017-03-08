package com.yyyu.pattern.state.define;

/**
 * 状态接口：用来封装与上下文的一个特定状态所对应的行为
 */
public interface State {

    /**
     * 状态的处理
     * @param simplePram 示例参数
     */
    void handle(String  simplePram);

}
