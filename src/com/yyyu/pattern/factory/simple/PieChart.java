package com.yyyu.pattern.factory.simple;

/**
 * Concrete AbstractProductA:具体的产品实现
 */
public class PieChart extends Chart{

    @Override
    public void createChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void displayChart() {
        System.out.println("显示饼状图");
    }
}
