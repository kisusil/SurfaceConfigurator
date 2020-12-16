package com.example.fourthlab.work;

import java.util.Random;

public class MineWork extends WorkProcess {
    Fossils lunit = Fossils.LUNIT;
    Fossils antilunit = Fossils.ANTI_LUNIT;

    public MineWork(String action, int time) {
        super(action, time);
    }

    @Override
    public void doAction() {
        System.out.println("\'" + "Добыть лунит и антилунит" + "\'");
        lunit.setAmount(new Random().nextInt(50));
        antilunit.setAmount(new Random().nextInt(50));
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + lunit + "\n" + antilunit;
    }
}
