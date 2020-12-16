package com.example.fourthlab.spaceObject;

public class Sun extends BaseDecorator {

    public Sun(Environment surface) {
        this.environment = surface;
        name = "Sun";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        setColor(EnvironmentColor.LIGHT);
        setDescription(environment.getDescription() + ", ярко-желтое Солнце");
    }
}
