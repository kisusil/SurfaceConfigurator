package com.example.fourthlab.spaceObject;

import java.util.Objects;

public abstract class BaseDecorator implements Environment {

    protected String name;
    protected Environment environment;
    protected String description;


    @Override
    public void illuminate() {
    }

    @Override
    public EnvironmentColor getColor() {
        return environment.getColor();
    }

    @Override
    public void setColor(EnvironmentColor color) {
        environment.setColor(color);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDecorator that = (BaseDecorator) o;
        return name.equals(that.name) &&
                environment.equals(that.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, environment);
    }

    @Override
    public String toString() {
        return name + ": " + environment.getColor();
    }
}
