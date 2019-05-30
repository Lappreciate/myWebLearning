package com.lsy.concurrent;

import java.util.concurrent.TimeUnit;

public class ExceptionThreadDemo {
    private static boolean i;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
           while(true) {
               try {
                   TimeUnit.SECONDS.sleep(1);//被中断之后  先复位再抛异常
                   System.out.println(Thread.currentThread().isInterrupted());
               } catch (InterruptedException e) {
                   e.printStackTrace();
                   break;
               }
           }
        });
        thread.interrupt();//true
        thread.start();
         TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
        System.out.println(thread.isInterrupted());
    }

}
