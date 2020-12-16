package com.example.fourthlab.rocket;

import java.util.Random;

public class Lights implements RocketStuff {
    private final String description = "Освещение ракеты";
    private boolean isEnabled = new Random().nextBoolean();

    @Override
    public String toString() {
        return description + (isEnabled ? " работает" : " не работает");
    }
}
