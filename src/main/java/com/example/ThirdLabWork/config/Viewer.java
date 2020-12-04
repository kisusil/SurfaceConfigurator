package com.example.ThirdLabWork.config;

import com.example.ThirdLabWork.surface.Surface;

import java.util.Objects;


public class Viewer {
    private SkyModeBuilderSet builderSet;
    private Surface surface;

    public Viewer(SkyModeBuilderSet builderSet) {
        this.builderSet = builderSet;
        surface = builderSet.getBuilder().build();
    }

    public Surface getSurface() {
        return surface;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viewer viewer = (Viewer) o;
        return builderSet == viewer.builderSet &&
                surface.equals(viewer.surface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builderSet, surface);
    }

    @Override
    public String toString() {
        return builderSet.toString() + "\n" +
                surface.getColor() + "\n" +
                surface.getDescription().replaceFirst(",", ":") + "\n";
    }
}
