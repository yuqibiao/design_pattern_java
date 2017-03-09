package com.yyyu.pattern.facade;

import com.yyyu.pattern.facade.define.Facade;

/**
 * Created by yyyu on 2017/3/8.
 */
public class Client {

    public static void main(String[] args){
        Facade facade = new Facade();
        facade.test();
    }

}
