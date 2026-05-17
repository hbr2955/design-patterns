package com.designpattern.strategy.strategyWith;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("SPORTS DRIVE");
    }
}
