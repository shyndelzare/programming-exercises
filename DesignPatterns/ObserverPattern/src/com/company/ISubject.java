package com.company;

public interface ISubject {
    void notifyObservers();
    void registerObserver(IObserver observer);
    void unregisterObserver(IObserver observer);
}
