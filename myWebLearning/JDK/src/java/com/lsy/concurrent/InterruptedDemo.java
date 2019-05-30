package com.lsy.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * Thread.interrupted(); 将interrupt置回false 复位
 * thread.interrupt(); 将标志位置为true
 */
public class InterruptedDemo {
    private static int i;

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
           while(!Thread.currentThread().isInterrupted()) {
               i++;
           }
           System.out.println(i);
        });
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();//将变量设置为true
    }
}
