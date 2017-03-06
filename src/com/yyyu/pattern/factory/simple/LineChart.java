package com.yyyu.pattern.factory.simple;

/**
 * Concrete AbstractProductA:具体的产品实现
 */
public class LineChart extends Chart{

    @Override
    public void createChart() {
        System.out.println("创建了线状图");
    }

    @Override
    public void displayChart() {
        System.out.println("显示线状图");
    }
}
