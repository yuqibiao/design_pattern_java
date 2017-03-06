package com.yyyu.pattern.factory.simple;

/**
 * Factory工厂类
 */
public class ChartFactory {

    public static Chart factoryMethod(String type){

        if ("line".equalsIgnoreCase(type)){
            return new LineChart();
        }else if("pie".equalsIgnoreCase(type)){
            return new PieChart();
        }else{
            //默认创建
            return new LineChart();
        }

    }

}
