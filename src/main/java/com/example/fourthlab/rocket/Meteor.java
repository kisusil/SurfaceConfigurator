package com.example.fourthlab.rocket;

public class Meteor {
    private int damageToRocket;

    public Meteor(int damageToRocket) {
        this.damageToRocket = damageToRocket;
    }

    public int getDamage() {
        return damageToRocket;
    }

    @Override
    public String toString() {
        return "Метеорит нанес первой ракете " + damageToRocket + " урона";
    }
}
