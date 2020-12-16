package com.example.fourthlab.rocket;

import java.util.Random;

public class Engine implements RocketStuff {
    private final String description = "Двигатель";
    private boolean isEnabled = new Random().nextBoolean();

    @Override
    public String toString() {
        return description + (isEnabled ? " работает" : " не работает");
    }
}
