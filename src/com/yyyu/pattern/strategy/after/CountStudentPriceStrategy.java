package com.yyyu.pattern.strategy.after;

/**
 * 学生票价计算算法
 */
public class CountStudentPriceStrategy extends CountPriceStrategy{

    @Override
    public double getTicketPrice() {
        return ticketPrice *0.8;
    }
}
