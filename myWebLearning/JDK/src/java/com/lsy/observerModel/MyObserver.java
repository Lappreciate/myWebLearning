package com.lsy.observerModel;

import java.util.Observable;
import java.util.Observer;


public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("event!!!");
        System.out.println(o.countObservers());
        System.out.println(arg.toString());
    }
}
