package com.codecool;

public class Truck implements Vehicle {

    private int name;
    private int normalSpeed;
    private int distanceTraveled = 0;

    public Truck(int name) {
        this.name = name;
    }

    private void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    private int getNormalSpeed() {
        return normalSpeed;
    }

    void printTruckDetails() {
        System.out.println(name + " " + getNormalSpeed() + " " + distanceTraveled + "km teherautó");

    }

    void breakdownTurnsLeft() {

    }

    @Override
    public void moveForAnHour(Race race) {
        if (race.isThereABrokenTruck()) {
            setNormalSpeed(0);
        } else {
            setNormalSpeed(100);
        }
        distanceTraveled += getNormalSpeed();
    }
}
