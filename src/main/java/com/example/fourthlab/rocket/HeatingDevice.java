package com.example.fourthlab.rocket;

import java.util.Random;

public class HeatingDevice implements RocketStuff {
    private final String description = "Отопительные приборы";
    private boolean isEnabled = new Random().nextBoolean();

    @Override
    public String toString() {
        return description + (isEnabled ? " работают" : " не работают");
    }
}
