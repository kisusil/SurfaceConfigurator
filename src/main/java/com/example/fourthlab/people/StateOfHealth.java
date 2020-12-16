package com.example.fourthlab.people;

public enum  StateOfHealth {
    NORMAL("Космонафт чувствует себя хорошо"),
    TIRED("Космонафт устал"),
    VERY_BAD("Космонафту очень плохо и он хочет, чтобы его потаскали на ручках и рассказали сказку");

    private String description;

    StateOfHealth(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
