package com.designpattern.strategy.strategyWith;

public class PassengerVehicle extends Vehicle {
 PassengerVehicle(){
     super(new SportsDriveStrategy());
 }
}
