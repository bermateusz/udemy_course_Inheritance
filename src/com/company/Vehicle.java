package com.company;

public class Vehicle {

    private int handSteering;
    private int changingGear;
    private int speed;

    public Vehicle(int handSteering, int changingGear, int speed) {
        this.handSteering = handSteering;
        this.changingGear = changingGear;
        this.speed = speed;
    }

    public void gears(int speed){
        System.out.println("Vehicle.gears called");
    }

    public int getHandSteering() {
        return handSteering;
    }

    public int getChangingGear() {
        return changingGear;
    }

    public int getSpeed() {
        return speed;
    }
}
