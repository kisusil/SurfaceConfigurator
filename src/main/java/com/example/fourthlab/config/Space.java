package com.example.fourthlab.config;

import java.util.Objects;

public class Space {
    private int starAmount;

    public Space(int starAmount) {
        this.starAmount = starAmount;
    }

    @Override
    public String toString() {
        return "В открытом космосе можно наблюдать борьбу ярких цветов, исходящих от ближайших планет и дальних звезд." +
                "\n" + "Над головой черное бездонное небо с миллирдами звезд" + "\n"
                + "Незнайка смог сосчитать " + starAmount + " из них.\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Space space = (Space) o;
        return starAmount == space.starAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(starAmount);
    }
}
