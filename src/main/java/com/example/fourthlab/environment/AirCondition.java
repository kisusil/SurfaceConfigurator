package com.example.fourthlab.environment;

public enum  AirCondition {
    FULL_OF_SPACE_RAYS("Из-за солнечных лучей обстановка опасна для космонафта"),
    THIN_AIR("Жизни космонафта ничего не угрожает");

    private String description;

    AirCondition(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return description;
    }
}
