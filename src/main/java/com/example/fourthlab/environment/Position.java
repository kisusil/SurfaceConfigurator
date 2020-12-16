package com.example.fourthlab.environment;

public enum  Position {
    FROZEN_MOON_TUNNEL("Группа находится в ледяном туннеле"),
    ICICLE_GROTTO("Группа находится в сосульчатом гротто"),
    CAVE("Группа находится в пещере"),
    ZERO_GRAVITY("Группа выстроилась в линию и начала отрывать от поверхности"),
    ROCKET("Группа космонавтов идут осматривать ракету"),
    SPACE("Группа космонавтов находятся в космосе на запасной ракете");

    private String description;

    Position(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
