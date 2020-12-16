package com.example.fourthlab.spaceObject;

public enum EnvironmentColor {
    LIGHT("Поверхность освещена солнцем"),
    DARK("Поверхность не освещена ничем"),
    DIRECT_LIGHT("Солнце освещает все прямыми лучами"),
    OBLIQUE_LIGHT("Солнце освещает все косыzzzми лучами"),
    SPARKLING("Сверкающий"),
    LUMINOUS("Светящийся"),
    REDDISH("Красноватый"),
    LIGHT_CHERRY("Светло-Вишневый"),
    BRIGHT("Ярко-голубой"),
    PURPLE("Поверхность сверкает багрянцем"),
    ECLIPSE_COLOR("Поверхность покрыта тенью луны"),
    MOON_ECLIPSE_COLOR("Поверхность покрыта тенью от земли"),
    REFLECTED_LIGHT("Отраженный свет еле освещает поверхность");

    private String description;

    EnvironmentColor(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
