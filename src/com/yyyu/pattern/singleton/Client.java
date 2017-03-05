package com.yyyu.pattern.singleton;

/**
 * Created by yyyu on 2017/3/5.
 */
public class Client {

    public static void main(String[] args){

     for (int i = 0 ; i<10 ; i++){
         new Thread(new Runnable() {
             @Override
             public void run() {
                 Singleton3 singleton3 = Singleton3.mInstance;
                 singleton3.sayHello();
                 System.out.println("singleton3=="+singleton3);
             }
         }).start();
     }

    }

}
