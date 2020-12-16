package com.example.fourthlab.work;

import java.util.Random;

public enum  Fossils {
    LUNIT("Лунита добыто: "),
    ANTI_LUNIT("Антилунита добыто: ");

    private String description;
    private int amount;


    Fossils(String description) {
        this.description = description;
        this.amount = new Random().nextInt(101);
        if(amount > 100) {
            throw new FossilsOverflowException("Объем добытых ископаемых превышен: " + amount);
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return description + " " + amount;
    }
}
