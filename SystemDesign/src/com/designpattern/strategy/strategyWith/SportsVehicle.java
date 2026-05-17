package com.designpattern.strategy.strategyWith;

public class SportsVehicle extends Vehicle {

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }

}
