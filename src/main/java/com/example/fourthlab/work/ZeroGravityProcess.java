package com.example.fourthlab.work;

import com.example.fourthlab.people.Lunatics;

public class ZeroGravityProcess extends WorkProcess {
    public ZeroGravityProcess(String action, int time) {
        super(action, time);
    }

    @Override
    public void doAction() {
        Lunatics lunatics = new Lunatics();
        System.out.print("\'");
        lunatics.watch();
        System.out.println(getAction());
        lunatics.waitForAstronauts();
        System.out.println("\'");
    }
}
