package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subject1 implements ISubject{
    private List<IObserver> observerList;
    private int value;

    public Subject1() {
        observerList = new ArrayList<>();
    }

    public void setMyValue(int newValue) {
        value = newValue;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (IObserver o :
                observerList) {
            o.update(value);
        }
    }

    @Override
    public void registerObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(IObserver observer) {
        observerList.remove(observer);
    }
}
