package com.example.fourthlab.work;

public class SpaceGroup extends WorkProcess {

    public SpaceGroup(String action, int time) {
        super(action, time);
    }

    @Override
    public void doAction() {
        System.out.println("\'" + getAction() + "\'");
    }
}
