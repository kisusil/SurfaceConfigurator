package com.example.fourthlab.work;

import java.util.Formatter;

public abstract class WorkProcess {
    private String action;
    private String sTime;


    public WorkProcess(String action, int time) {
        this.action = action;

        // Пример локального класса
        class Time {
            private int minutes;

            public Time(int minutes) {
                this.minutes = minutes;
            }

            @Override
            public String toString() {
                return new Formatter().format("%d минут", minutes).toString();
            }
        }

        Time mTime = new Time(time);

        sTime = mTime.toString();

    }

    public abstract void doAction();

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Действие: " + action + " будет выполнено через " + sTime;
    }
}
