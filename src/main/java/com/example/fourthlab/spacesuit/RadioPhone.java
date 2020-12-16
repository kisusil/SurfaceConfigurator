package com.example.fourthlab.spacesuit;

public class RadioPhone implements Tool {
    private String description = "Радио телефон";

    @Override
    public void doWork() {
        System.out.println(description);
    }

    @Override
    public String toString() {
        return description;
    }
}
