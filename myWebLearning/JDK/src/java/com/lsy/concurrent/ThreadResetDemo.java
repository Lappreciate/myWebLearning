package com.lsy.concurrent;


public class ThreadResetDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            //while(true){
//                if(Thread.currentThread().isInterrupted()){
                    System.out.println("before:"+Thread.currentThread().isInterrupted());
                    Thread.interrupted();//2、将interrupt置回false
                    System.out.println("after:"+Thread.currentThread().isInterrupted());
                //}
           // }
        });
        thread.start();
//        TimeUnit.SECONDS.sleep(1);
//        thread.interrupt();//1、将interrupt置为true

    }
}
