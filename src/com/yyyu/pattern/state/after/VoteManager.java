package com.yyyu.pattern.state.after;

import com.yyyu.pattern.proxy.example.InfoLogger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yyyu on 2017/3/8.
 */
public class VoteManager {

    /**
     * 记录投票次数
     * String：用户名称 Integer：投票次数
     */
    public Map<String , Integer> mapCount = new HashMap<>();

    /**
     * 记录投票结果
     * String :用户名 String：投票结果
     *
     */
    public  Map<String , String> mapResult = new HashMap<>();

    public void vote(String user , String voteItem){

        Integer voteCount = mapCount.get(user);
        if (voteCount == null) voteCount = 0;
        voteCount++;
        mapCount.put(user , voteCount);
        State voteState = null;
        if (voteCount == 1){
            voteState = new NormalState();
        }else if(voteCount<5){
            voteState = new RepeatState();
        }else if(voteCount<8){
            voteState = new SpiteState();
        }else{
            voteState = new BlackState();
        }
        voteState.vote(user , voteItem , this);

    }


}
