package com.yyyu.pattern.strategy.before;

/**
 * 问题描述：
 *Sunny软件公司为某电影院开发了一套影院售票系统，在该系统中需要为不同类型的用户提供不同的
 * 电影票打折方式，具体打折方案如下：
 * (1) 学生凭学生证可享受票价8折优惠；
 * (2) 年龄在10周岁及以下的儿童可享受每张票减免10元的优惠（原始票价需大于等于20元）；
 * (3) 影院VIP用户除享受票价半价优惠
 *
 * 不使用策略模式的情况
 *
 * 存在问题：
 * getTicketPrice 的责任太重，每添加一种算法都需要在修改里面的代码，代码分支太多很容易出错，、
 * 而且也不满足开闭原则。
 * 算法的复用性太差，这里面定义的算法，如果其他地方有类似的算法也无法复用。
 *
 */
public class MoveTicket {

    private int userType;
    private double ticketPrice = 100.0;//这里写死了，方便查看

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public double getTicketPrice() {//很容易出错，不便于测试修改
        if(userType == 1){//学生
            ticketPrice= ticketPrice*0.8;
        }else if(userType == 2){//年龄在10周岁以下
            if(ticketPrice>=20){
                ticketPrice -=20;
            }
        }else if(userType == 3){//vip用户
            ticketPrice = ticketPrice *0.5;
        }else{//普通用户

        }
        return ticketPrice;
    }

}
