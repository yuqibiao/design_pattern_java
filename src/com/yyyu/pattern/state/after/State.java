package com.yyyu.pattern.state.after;

/**
 * Created by yyyu on 2017/3/8.
 */
public interface State {

    void vote(String user , String voteItem , VoteManager voteManager);

}
