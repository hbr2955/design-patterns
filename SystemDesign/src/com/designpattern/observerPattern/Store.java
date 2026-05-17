package com.designpattern.observerPattern;

import com.designpattern.observerPattern.Observable.IphoneObservableImpl;
import com.designpattern.observerPattern.Observable.StockObservable;
import com.designpattern.observerPattern.Observer.EmailAlertObserverImpl;
import com.designpattern.observerPattern.Observer.MobileAlertObservableImpl;
import com.designpattern.observerPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        System.out.println("Lets see how it works");
        System.out.println("Created new branch");
        System.out.println("FOR PR");
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("hbr@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObservableImpl("hbr21212@gmail.com",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);


        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(10);


    }
}
