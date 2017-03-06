package com.yyyu.pattern.strategy.after;

/**
 * vip票价计算算法
 */
public class CountVipPriceStrategy extends CountPriceStrategy{

    @Override
    public double getTicketPrice() {
        return ticketPrice *0.5;
    }
}
