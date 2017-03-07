package com.yyyu.pattern.command;

import com.yyyu.pattern.command.define.ConcreteCommandA;
import com.yyyu.pattern.command.define.Invoker;
import com.yyyu.pattern.command.define.Receiver;

/**
 * Created by yyyu on 2017/3/7.
 */
public class Client {

    public static void main(String[] args){

        Invoker invoker = new Invoker(new ConcreteCommandA(new Receiver()));
        invoker.runCommand();

    }

}
