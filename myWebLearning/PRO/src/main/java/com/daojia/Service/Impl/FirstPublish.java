package com.daojia.Service.Impl;

import com.daojia.myEvent.FirstEvent;
import com.daojia.pojo.Apple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class FirstPublish {

    @Autowired
    private ApplicationContext ctx;

    public void publish(){

        //创建一个事件
        FirstEvent firstEvent = new FirstEvent(new Apple());

        ctx.publishEvent(firstEvent);
    }
}
