package com.yyyu.pattern.state.after;

/**
 * 正常投票状态
 */
public class NormalState implements State{
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.mapResult.put(user , voteItem);
        System.out.println("投票成功，谢谢你的投票");

    }
}
