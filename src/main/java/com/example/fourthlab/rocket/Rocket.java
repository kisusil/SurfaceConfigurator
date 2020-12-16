package com.example.fourthlab.rocket;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rocket {
    private List<RocketStuff> rocketStuffs;
    private int health;

    public Rocket() {
        health = 100;
        rocketStuffs = new ArrayList<>();
        rocketStuffs.add(new Accumulator());
        rocketStuffs.add(new Bed());
        rocketStuffs.add(new Cabin());
        rocketStuffs.add(new ElectronicComputer());
        rocketStuffs.add(new Lights());
        rocketStuffs.add(new Engine());
        rocketStuffs.add(new HeatingDevice());
    }

    public void setDamage(Meteor meteor) {
        health -= meteor.getDamage();
    }

    public String takeOff() {
        return health > 0
                ? "После того, как все прибыли, ракета взлетела"
                : "Ракета уже никогда не взлетит. Все космонавты обречены";
    }

    @Override
    public String toString() {
        String rocketIsAlive = "Вдали также виднеется ярко-голубая вторая ракета.\n" +
                "\nВнутри ракет имеются: " +
                rocketStuffs
                        .toString()
                        .substring(1, rocketStuffs.toString().length()-1)
                        .replaceAll(",","\n");
        String rocketIsDestroyed = "Ракета уничтожена, все люди на борту погибли";
        return (health > 0 ? rocketIsAlive : rocketIsDestroyed) + "\n" + takeOff();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rocket rocket = (Rocket) o;
        return health == rocket.health &&
                rocketStuffs.equals(rocket.rocketStuffs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rocketStuffs, health);
    }
}
