package com.example.fourthlab.rocket;

public class ElectronicComputer implements RocketStuff {

    private final String description = "Электронно-вычислительная машина ракеты";

    @Override
    public String toString() {
        return description;
    }
}
