package com.yyyu.pattern.strategy.after;

/**
 * 票价的环境类
 */
public class TicketPriceContext {

    private CountPriceStrategy mStrategy;

    public void setCountPriceStrategy(CountPriceStrategy strategy){

        this.mStrategy = strategy;

    }

    public double getTicketPrice(){
        return mStrategy.getTicketPrice();
    }

}
