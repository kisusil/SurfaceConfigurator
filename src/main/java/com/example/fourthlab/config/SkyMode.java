package com.example.fourthlab.config;

import com.example.fourthlab.environment.AirCondition;

public enum SkyMode {
    MoonDay(
            "Космонафт стоит на луне. Поверхность покрыта трещинками. Светит солнце.",
            AirCondition.FULL_OF_SPACE_RAYS),
    MoonNightObliqueLight(
            "Космонафт стоит на луне. Поверхность покрыта трещинками. Ночь.",
            AirCondition.THIN_AIR),
    MoonNightDirectLight(
            "Космонафт стоит на луне. Поверхность покрыта трещинками. Ночь.",
            AirCondition.THIN_AIR),
    MoonEclipse(
            "Космонафт стоит на луне. Поверхность покрыта трещинками. Затмение",
            AirCondition.FULL_OF_SPACE_RAYS),
    Space(
            "Космонафт находится в открытом космосе",
            AirCondition.FULL_OF_SPACE_RAYS);

    private String description;
    private AirCondition airCondition;

    SkyMode(String description, AirCondition airCondition) {
        this.description = description;
        this.airCondition = airCondition;
    }

    @Override
    public String toString() {
        return description + "\n" + airCondition;
    }
}