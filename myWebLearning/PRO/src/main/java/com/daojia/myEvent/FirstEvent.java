package com.daojia.myEvent;

import com.daojia.pojo.Fruit;
import org.springframework.context.ApplicationEvent;

public class FirstEvent extends ApplicationEvent {

    private Fruit fruit;

    public FirstEvent(Fruit fruit) {
        super(fruit);
        this.fruit = fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
}
