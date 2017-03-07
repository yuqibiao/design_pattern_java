package com.yyyu.pattern.proxy.example;

/**
 * 查询业务实现类
 */
public class RealSearcher implements Searcher{


    @Override
    public void doSearcher(int userId, String keyword) {
        if(userId==1 || keyword.equalsIgnoreCase("yu")){
            System.out.println("查询到用户信息");
        }
    }
}
