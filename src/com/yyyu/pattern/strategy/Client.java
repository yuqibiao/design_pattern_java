package com.yyyu.pattern.strategy;

import com.yyyu.pattern.strategy.after.*;
import com.yyyu.pattern.strategy.define.Context;
import com.yyyu.pattern.strategy.define.Strategy;
import com.yyyu.pattern.strategy.define.StrategyA;
import com.yyyu.pattern.strategy.define.StrategyB;

/**
 * Created by yyyu on 2017/3/6.
 */
public class Client {

    public static void main(String[] args){

      /*  Strategy strategyA = new StrategyA();
        Strategy strategyB = new StrategyB();
        Context context = new Context();
        //---使用算法A
        context.setStrategy(strategyA);
        System.out.println(context.algorithm());
        //---使用算法B
        context.setStrategy(strategyB);
        System.out.println(context.algorithm());*/

        CountPriceStrategy strategyStudent = new CountStudentPriceStrategy();
        CountPriceStrategy strategyChild= new CountChildPriceStrategy();
        CountPriceStrategy strategyVip= new CountVipPriceStrategy();
        TicketPriceContext context = new TicketPriceContext();
        context.setCountPriceStrategy(strategyStudent);
        System.out.println("学生价=="+context.getTicketPrice());
        context.setCountPriceStrategy(strategyChild);
        System.out.println("儿童价=="+context.getTicketPrice());
        context.setCountPriceStrategy(strategyVip);
        System.out.println("Vip价=="+context.getTicketPrice());

    }

}
