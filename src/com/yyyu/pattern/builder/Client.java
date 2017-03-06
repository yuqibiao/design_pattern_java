package com.yyyu.pattern.builder;

/**
 * Created by yyyu on 2017/3/5.
 */
public class Client {

    public static void main(String[] args){

        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);
    }

}
