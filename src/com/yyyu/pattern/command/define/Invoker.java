package com.yyyu.pattern.command.define;

/**
 * 命令的发出者
 */
public class Invoker {

    private Command mCommand;

    public  Invoker(Command command){
        this.mCommand = command;
    }

    public void runCommand(){
        mCommand.execute();
    }

}
