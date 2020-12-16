package com.example.fourthlab.config;

import com.example.fourthlab.rocket.Meteor;
import com.example.fourthlab.rocket.Rocket;
import com.example.fourthlab.work.Group;

import java.util.List;
import java.util.Random;

public class Executor {

    private List<Group> groups;
    private Rocket rocket;
    private Space space = new Space(100);

    public Executor(List<Group> groups) {
        this.groups = groups;
        this.rocket = new Rocket();
    }

    public void execute() {
        System.out.println(space);

        for (Group g: groups) {
            System.out.println(g);
        }

        Meteor meteor = new Meteor(new Random().nextInt(101));
        rocket.setDamage(meteor);
        System.out.println(meteor);
        System.out.println(rocket);
    }

    @Override
    public String toString() {
        return "Executor";
    }
}
