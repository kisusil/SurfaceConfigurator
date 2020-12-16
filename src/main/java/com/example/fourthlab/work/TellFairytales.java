package com.example.fourthlab.work;

public class TellFairytales extends WorkProcess {

    public TellFairytales(String action, int time) {
        super(action, time);
    }

    @Override
    public void doAction() {
        Fairytale fairytale = new Fairytale(getAction());
        System.out.println("\'" + fairytale + "\'");
    }

    // Пример внутреннего класса
    public class Fairytale {
        private String description;

        public Fairytale(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }
}
