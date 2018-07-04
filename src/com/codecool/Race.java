package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Race {
    private static Race race = new Race();
    private static Random random = new Random();
    private Car car;
    private Truck truck;
    private Motor motor;
    private static ArrayList<String> carNames = new ArrayList<>(Arrays.asList("Intro", "Vortex", "Ferocity", "Sprite", "Vision", "Sliver", "Aurora", "Celestial", "Excursion", "Crux"));
    private static int chanceToBreakDown = 0;
    private static int chanceToRaining = 0;



    private void createVehicles() {
        this.motor = new Motor("Motorcycle ");
        this.truck = new Truck(random.nextInt(1000));
        this.car = new Car(MyRandom.createRandomPlayers(carNames));
        System.out.println();

    }

    private void simulateRace() {
        for (int i = 0; i < 50; i++) {
            chanceToBreakDown = random.nextInt(100);
            chanceToRaining = random.nextInt(100);
            motor.moveForAnHour(race);
            car.moveForAnHour(race);
            truck.moveForAnHour(race);
        }
    }

    private void printRaceResults() {
        System.out.println();
        car.printCarDetails();
        motor.printMotorDetails();
        truck.printTruckDetails();

    }

    boolean isThereABrokenTruck() {
        return chanceToBreakDown <= 5;

    }

    boolean isRaining() {
        return chanceToRaining <= 30;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            race.createVehicles();
            race.simulateRace();
            race.printRaceResults();
        }
    }
}
