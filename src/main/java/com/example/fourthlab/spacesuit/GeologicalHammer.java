package com.example.fourthlab.spacesuit;

public class GeologicalHammer implements Tool {
    private String description = "Геологический молот";

    @Override
    public void doWork() {
        System.out.println(description);
    }

    @Override
    public String toString() {
        return description;
    }
}
