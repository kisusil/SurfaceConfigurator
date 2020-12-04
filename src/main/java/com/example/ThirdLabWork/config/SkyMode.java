package com.example.ThirdLabWork.config;

public enum SkyMode {
    MoonDay("Знайка стоит на луне. Светит солнце."),
    MoonNight("Знайка стоит на луне. Ночь."),
    MoonEclipse("Знайка стоит на луне. Затмение"),
    EarthDay("Знайка стоит на земле. Светит солнце"),
    EarthNight("Знайка стоит на земле. Ночь."),
    EarthEclipse("Знайка стоит на земле. Затмение");

    private String description;

    SkyMode(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}