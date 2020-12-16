package com.example.fourthlab.config;

import com.example.fourthlab.spaceObject.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SurfaceBuilder {

    private static List<SurfaceBuilder> builders;

    static {
        builders = new ArrayList<>();

        builders.add(new SurfaceBuilder()
                .setSun()
                .setFullEarth());

        builders.add(new SurfaceBuilder()
                .setSun()
                .setHalfEarth()
                .setStar());

        builders.add(new SurfaceBuilder()
                .setHalfEarth());

        builders.add(new SurfaceBuilder()
                .setSpace());

        builders.add(new SurfaceBuilder()
                .setSun()
                .setStar()
                .setMountain());
    }

    private Environment environment;

    public SurfaceBuilder() {
        environment = new DefaultEnvironment();
        environment.setDescription("Вокруг виднеются");
        environment.setColor(EnvironmentColor.DARK);
    }

    public SurfaceBuilder setSun() {
        environment = new Sun(environment);
        return this;
    }

    public SurfaceBuilder setFullEarth() {
        environment = new FullEarth(environment);
        return this;
    }

    public SurfaceBuilder setHalfEarth() {
        environment = new HalfEarth(environment);
        return this;
    }

    public SurfaceBuilder setStar() {
        environment = new Star(environment);
        return this;
    }

    public SurfaceBuilder setMountain() {
        environment = new Mountain(environment);
        return this;
    }

    public SurfaceBuilder setSpace() {
        environment = new SpaceDecorator(environment);
        return this;
    }

    public Environment build() {
        return environment;
    }

    public static SurfaceBuilder getDefaultSet(SkyMode skyMode) {
        switch (skyMode) {
            case MoonEclipse:
                return builders.get(0);
            case MoonNightDirectLight:
                return builders.get(1);
            case MoonNightObliqueLight:
                return builders.get(2);
            case Space:
                return builders.get(3);
        }
        return builders.get(4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SurfaceBuilder that = (SurfaceBuilder) o;
        return environment.equals(that.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment);
    }

    @Override
    public String toString() {
        return "Builder: " + environment.getColor();
    }
}
