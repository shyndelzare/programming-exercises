package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subject2 implements ISubject {
    private int value;
    private List<IObserver> observerList = new ArrayList<>();

    public void setMyValue(int newValue) {
        value = newValue;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer :
                observerList) {
            observer.update(value);
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
