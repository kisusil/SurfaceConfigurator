package com.example.ThirdLabWork.surface;

import java.util.Objects;

public class DefaultSurface implements Surface {

    private SurfaceColor color;
    private String description;

    @Override
    public void illuminate() {
        setColor(SurfaceColor.DARK);
    }

    public SurfaceColor getColor() {
        return color;
    }

    public void setColor(SurfaceColor color) {
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
        DefaultSurface that = (DefaultSurface) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Default Surface: " + color;
    }
}
