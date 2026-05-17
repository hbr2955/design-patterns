package com.designpattern.observerPattern.Observer;

import com.designpattern.observerPattern.Observable.StockObservable;

public class MobileAlertObservableImpl implements NotificationAlertObserver {
    String userName;
    StockObservable observable;

    public MobileAlertObservableImpl(String userName,StockObservable observable){
        this.userName =userName;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in stock");
    }

    public void sendMsgOnMobile(String userName, String msg){
        System.out.println("msg sent to: "+ userName);
    }
}
