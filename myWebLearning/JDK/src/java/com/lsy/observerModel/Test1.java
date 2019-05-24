package com.lsy.observerModel;

public class Test1 {
    public static void main(String[] args) {
       Subject subject = new Subject();
       MyObserver observer = new MyObserver();
       subject.addObserver(observer);


       subject.setEvent("数学");
       System.out.println(subject.hasChanged());


    }
}
