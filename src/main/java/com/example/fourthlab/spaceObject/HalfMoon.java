package com.example.fourthlab.spaceObject;

public class HalfMoon extends BaseDecorator {

    public HalfMoon(Environment surface) {
        this.environment = surface;
        name = "Half Moon";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        setColor(EnvironmentColor.REFLECTED_LIGHT);
        setDescription(environment.getDescription() + ", белая Луна в виде месяца");
    }
}