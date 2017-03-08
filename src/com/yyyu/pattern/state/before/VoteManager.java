package com.yyyu.pattern.state.before;

import com.yyyu.pattern.proxy.example.InfoLogger;

import java.util.HashMap;
import java.util.Map;

/**
 * 投票系统
 *
 * 1.用户正常投票（1次）
 * 2.用户无意重复投票（小于五次）
 * 3.用户恶意投票（小于8次）
 * 4.黑名单（大于八次）
 *
 * 问题：
 *VoteManager 负责的功能太多，if-else 分支也太多。每次给投票结果增加一个
 * 状态时都需要多一个条件分支，当其状态的业务逻辑具体实现后可以看到这个类
 * 会非常的庞大。决解问题的思路就是使用状态模式将状态和行为分开，每次增加
 * 一个状态只需多增加一个类和少量的代码修改，更符合开闭原则。
 *
 */
public class VoteManager {

    /**
     * 记录投票次数
     * String：用户名称 Integer：投票次数
     */
    private Map<String , Integer> mapCount = new HashMap<>();

    /**
     * 记录投票结果
     * String :用户名 String：投票结果
     *
     */
    private  Map<String , String> mapResult = new HashMap<>();

    public void vote(String user , String voteItem){

        Integer voteCount = mapCount.get(user);
        if(voteCount == null){
            voteCount = 0;
        }
        voteCount++;
        mapCount.put(user , voteCount);
        if(voteCount==1){
            System.out.println("谢谢你的投票");
            mapResult.put(user , voteItem);
        }else if(voteCount<5){
            System.out.println("请不要重复投票");
        }else if (voteCount<8){
            mapResult.remove(user);
            System.out.println("你的投票已失效，不要恶意刷票");
        }else{
            System.out.println("你已被加入黑名单");
        }

    }


}
