package com.designpattern.strategy.strategyWith;

public class Vehicle {

    DriveStrategy driveStrategyObj;

    Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategyObj=driveStrategyObj;
    }
    public void drive(){
        driveStrategyObj.drive();
    }
}
