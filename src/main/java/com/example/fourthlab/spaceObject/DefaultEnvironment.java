package com.example.fourthlab.spaceObject;

import java.util.Objects;

public class DefaultEnvironment implements Environment {

    private EnvironmentColor color;
    private String description;

    @Override
    public void illuminate() {
        setColor(EnvironmentColor.DARK);
    }

    public EnvironmentColor getColor() {
        return color;
    }

    public void setColor(EnvironmentColor color) {
        this.color = color;
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
        DefaultEnvironment that = (DefaultEnvironment) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Черное небо: " + color;
    }
}
