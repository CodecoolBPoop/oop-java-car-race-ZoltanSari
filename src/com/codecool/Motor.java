package com.codecool;

import java.util.Random;

public class Motor implements Vehicle {

    private Random random = new Random();
    private String name;
    private int normalSpeed;
    private int distanceTraveled = 0;  // holds the current distance traveled.
    private static int nameNumber = 1;



    Motor(String name) {
        this.name = name + nameNumber;
        nameNumber++;
    }

    private void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    private int getNormalSpeed() {
        return normalSpeed;
    }

    void printMotorDetails() {
        System.out.println(name + " " + getNormalSpeed() + " " + distanceTraveled + "km motoros");

    }

    @Override
    public void moveForAnHour(Race race) {
        if (race.isThereABrokenTruck()) {
            setNormalSpeed(75);
        }
        else if(race.isRaining()) {
            setNormalSpeed(100 - (random.nextInt(50 - 5 + 1) + 5));
        }
        else {
            setNormalSpeed(100);
        }
        distanceTraveled += getNormalSpeed();
    }
}
