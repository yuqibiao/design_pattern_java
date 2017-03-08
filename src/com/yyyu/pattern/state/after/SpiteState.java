package com.yyyu.pattern.state.after;

/**
 * 恶意投票状态
 */
public class SpiteState implements State{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.mapResult.remove(user);
        System.out.println("你的投票已失效，不要恶意刷票");
    }
}
