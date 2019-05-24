package com.lsy.observerModel;

import java.util.Observable;

public class Subject extends Observable {

    private String event;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
        setChanged();
        notifyObservers(event);
    }
}
