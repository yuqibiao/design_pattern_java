package com.yyyu.pattern.proxy.example;

/**
 * 用户的验证
 */
public class ValidateUser {

    public boolean validate(int userId){
        if(userId<10){
            System.out.println("验证成功");
            return true;
        }else{
            System.out.println("验证失败");
            return false;
        }
    }

}
