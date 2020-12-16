package com.example.fourthlab.spaceObject;

public class Mountain extends BaseDecorator {
    public Mountain(Environment surface) {
        this.environment = surface;
        name = "Mountain";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        setDescription(environment.getDescription() + ", горы красноватого цвета");
    }
}
