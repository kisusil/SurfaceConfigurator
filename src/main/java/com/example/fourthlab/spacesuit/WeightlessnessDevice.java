package com.example.fourthlab.spacesuit;

public class WeightlessnessDevice implements Tool {
    private String description = "Анти-гравитационное устройтсов";

    @Override
    public void doWork() {
        System.out.println(description);
    }

    @Override
    public String toString() {
        return description;
    }
}
