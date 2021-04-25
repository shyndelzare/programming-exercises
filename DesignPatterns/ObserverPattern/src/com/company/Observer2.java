package com.company;

public class Observer2 implements IObserver {
    @Override
    public void update(int value) {
        System.out.println("Observer 2 notified value: " + value);
    }
}
