package com.yyyu.pattern.strategy.after;

/**
 * 计算票价的抽象类
 */
public abstract  class CountPriceStrategy {

    protected double ticketPrice = 90.0;

    public abstract double getTicketPrice();

}
