package com.example.fourthlab.rocket;

import java.util.Random;

public class Accumulator implements RocketStuff {
    private final String description = "Аккумулятор, который питает компьютер ракеты";

    private int battery = new Random().nextInt(100);

    @Override
    public String toString() {
        return description + ": " + battery + "%";
    }
}
