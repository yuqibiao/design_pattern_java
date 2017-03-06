package com.yyyu.pattern.strategy.after;

/**
 * 儿童票价算法
 */
public class CountChildPriceStrategy extends CountPriceStrategy{

    @Override
    public double getTicketPrice() {
        if (ticketPrice>=20){
            ticketPrice -=20;
        }
        return ticketPrice ;
    }
}
