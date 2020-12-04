package com.example.ThirdLabWork.config;

import com.example.ThirdLabWork.spaceObject.*;
import com.example.ThirdLabWork.surface.DefaultSurface;
import com.example.ThirdLabWork.surface.Surface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SurfaceColorBuilder {

    private static List<SurfaceColorBuilder> builders;

    static {
        builders = new ArrayList<>();

        builders.add(new SurfaceColorBuilder()
                .setSun()
                .setFullEarth());

        builders.add(new SurfaceColorBuilder()
                .setSun()
                .setFullMoon());

        builders.add(new SurfaceColorBuilder()
                .setHalfMoon());

        builders.add(new SurfaceColorBuilder()
                .setSun()
                .setHalfEarth());

        builders.add(new SurfaceColorBuilder()
                .setSun());
    }

    private Surface surface;

    public SurfaceColorBuilder() {
        surface = new DefaultSurface();
        surface.setDescription("Сверху виднеется");
    }

    public SurfaceColorBuilder setSun() {
        surface = new Sun(surface);
        return this;
    }

    public SurfaceColorBuilder setFullMoon() {
        surface = new FullMoon(surface);
        return this;
    }

    public SurfaceColorBuilder setHalfMoon() {
        surface = new HalfMoon(surface);
        return this;
    }

    public SurfaceColorBuilder setFullEarth() {
        surface = new FullEarth(surface);
        return this;
    }

    public SurfaceColorBuilder setHalfEarth() {
        surface = new HalfEarth(surface);
        return this;
    }

    public Surface build() {
        return surface;
    }

    public static SurfaceColorBuilder getDefaultSet(SkyMode skyMode) {
        switch (skyMode) {
            case EarthEclipse:
                return builders.get(0);
            case MoonEclipse:
                return builders.get(1);
            case EarthNight:
                return builders.get(2);
            case MoonNight:
                return builders.get(3);
        }
        return builders.get(4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SurfaceColorBuilder that = (SurfaceColorBuilder) o;
        return surface.equals(that.surface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surface);
    }

    @Override
    public String toString() {
        return "Builder: " + surface.getColor();
    }
}
