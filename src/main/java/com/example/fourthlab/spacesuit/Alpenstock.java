package com.example.fourthlab.spacesuit;

public class Alpenstock implements Tool {
    private String description = "Инструмент для удержания на льду";

    @Override
    public String toString() {
        return description;
    }

    @Override
    public void doWork() {
        System.out.println(description);
    }
}
