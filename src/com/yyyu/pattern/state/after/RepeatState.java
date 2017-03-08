package com.yyyu.pattern.state.after;

/**
 * 重复投票状态
 */
public class RepeatState implements State{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {

        System.out.println("请不要重复投票");
    }
}
