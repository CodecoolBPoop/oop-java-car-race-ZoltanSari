package com.codecool;
import java.util.*;

class MyRandom {

    static String createRandomPlayers(ArrayList<String> carList) {
        java.util.Random random = new java.util.Random();
        String randomElement = "";

        for (int i = 0; i < carList.size(); i++) {
            int randomIndex = random.nextInt(carList.size());
            randomElement = carList.get(randomIndex);
            carList.remove(randomIndex);
            return randomElement;

        }
        return "";
    }

}
