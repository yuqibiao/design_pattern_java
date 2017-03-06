package com.yyyu.pattern.factory;

import com.yyyu.pattern.factory.abstruct.AbstractFactory;
import com.yyyu.pattern.factory.abstruct.ConcreteFactory1;
import com.yyyu.pattern.factory.abstruct.ConcreteFactory2;

/**
 * 测试
 */
public class Client {

    public static void main(String[] args){
       /* Chart lineChart = ChartFactory.factoryMethod("line");
        lineChart.createChart();
        lineChart.displayChart();*/

      /* Factory factory = new FactoryProductA();//可以通过反射在配置文件中获取
       factory.factoryMethod();*/
        AbstractFactory factory = new ConcreteFactory2();
        factory.createProductA().display();
        factory.createProductB().display();
    }

}
