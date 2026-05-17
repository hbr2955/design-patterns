package com.designpattern.strategy.strategyWith;

public class OffroadVehicle extends Vehicle {

    OffroadVehicle(){
        super(new SportsDriveStrategy());
    }
}
