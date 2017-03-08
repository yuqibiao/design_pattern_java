package com.yyyu.pattern.state;

import com.yyyu.pattern.state.after.VoteManager;

/**
 * Created by yyyu on 2017/3/8.
 */
public class Client {

    public static void main(String[] args){

        /*VoteManager voteManager = new VoteManager();

        for (int i=0 ; i<10 ; i++){
            voteManager.vote("yu", "小花");
        }*/

        VoteManager voteManager = new VoteManager();
        for (int i=0 ; i<10 ; i++){
            voteManager.vote("yu", "小花");
        }


    }

}
