package com.company;

public class Observer3 implements IObserver {
    @Override
    public void update(int value) {
        System.out.println("Observer 3 notified value: " + value);
    }
}
