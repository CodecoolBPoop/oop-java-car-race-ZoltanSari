package com.codecool;

import java.util.Random;

public class Car implements Vehicle {

    private String name;
    private int normalSpeed;
    private int distanceTraveled = 0;  // holds the current distance traveled.
    private Random random = new Random();

    public Car(String name) {
        this.name = name;
    }

    private void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    private int getNormalSpeed() {
        return normalSpeed;
    }


    void printCarDetails() {
        System.out.println(name + " " + getNormalSpeed() + " " + distanceTraveled + "km kocsi");
    }
    @Override
    public void moveForAnHour(Race race) {
        if (race.isThereABrokenTruck()) {
            setNormalSpeed(75);
        } else {
            setNormalSpeed(random.nextInt(110 - 80 + 1)+ 80);
        }
        distanceTraveled += getNormalSpeed();
    }
}
