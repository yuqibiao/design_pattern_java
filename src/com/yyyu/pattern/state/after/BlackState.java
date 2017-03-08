package com.yyyu.pattern.state.after;

/**
 * 加入黑名单状态
 */
public class BlackState implements State{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("你已被加入黑名单");
    }
}
