package com.yyyu.pattern.command.define;

/**
 * 具体的命令A
 */
public class ConcreteCommandA implements Command{

    private Receiver mReceiver;

    public ConcreteCommandA(Receiver receiver){
        this.mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action();
    }
}
