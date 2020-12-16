package com.example.fourthlab.work;

public class InspectRocket extends WorkProcess {

    public InspectRocket(String action, int time) {
        super(action, time);
    }

    @Override
    public void doAction() {
        System.out.println("\'" + getAction() + "\'");
    }


}
