package com.example.fourthlab.spaceObject;

public class Star extends BaseDecorator {
    public Star(Environment surface) {
        this.environment = surface;
        name = "Star";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        setDescription(environment.getDescription() + ", сияющие звезды вдалеке");
    }
}
