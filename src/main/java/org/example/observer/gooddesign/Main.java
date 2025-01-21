package org.example.observer.gooddesign;

import org.example.observer.gooddesign.Observable.Stock;
import org.example.observer.gooddesign.Observer.MobileAppNotification;
import org.example.observer.gooddesign.Observer.Observer;
import org.example.observer.gooddesign.Observer.User;

public class Main {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150);

        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        // Users subscribe to stock updates
        appleStock.addObserver(user1);
        appleStock.addObserver(user2);

        // Update stock price and notify all observers
        appleStock.setPrice(155);

        // Bob unsubscribes from stock updates
        appleStock.removeObserver(user2);

        // Update stock price again, only Alice will be notified
        appleStock.setPrice(160);

        // Extending the System
        Observer mobileApp = new MobileAppNotification("Device1234");
        appleStock.addObserver(mobileApp);
        appleStock.setPrice(170);
    }
}