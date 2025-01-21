package org.example.observer.gooddesign.Observable;

import org.example.observer.gooddesign.Observer.Observer;

public interface StockSubject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}