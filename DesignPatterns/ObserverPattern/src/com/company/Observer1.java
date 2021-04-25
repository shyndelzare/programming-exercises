package com.company;

public class Observer1 implements IObserver {

    @Override
    public void update(int value) {
        System.out.println("Observer 1 notified value: " + value);
    }
}
