package com.example.fourthlab.spaceObject;

public class SpaceDecorator extends BaseDecorator {
    public SpaceDecorator(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        setDescription("Вокруг космос, вблизи видно несколько тел, серди которых луна");
    }
}
