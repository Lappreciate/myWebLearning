package com.daojia.myEvent;

import com.daojia.pojo.Apple;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements ApplicationListener<FirstEvent> {
    @Override
    @Async
    public void onApplicationEvent(FirstEvent firstEvent) {

        if(firstEvent.getFruit() instanceof Apple){
            System.out.println("this is an apple");
        }
    }
}
