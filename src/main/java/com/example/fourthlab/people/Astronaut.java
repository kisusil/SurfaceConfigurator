package com.example.fourthlab.people;

import com.example.fourthlab.config.SkyMode;
import com.example.fourthlab.config.SurfaceBuilder;
import com.example.fourthlab.spaceObject.Environment;
import com.example.fourthlab.spacesuit.SpaceSuit;

import java.util.Formatter;
import java.util.Objects;

public class Astronaut {
    private SkyMode skyMode;
    private Environment environment;
    private String name;
    private StateOfHealth condition;
    private boolean isLeader;
    private SpaceSuit suit;

    public Astronaut(String name,
                     SkyMode skyMode,
                     StateOfHealth condition,
                     boolean isLeader,
                     SpaceSuit suit) {
        this.name = name;
        this.skyMode = skyMode;
        this.condition = condition;
        this.isLeader = isLeader;
        this.suit = suit;

        // Автоматически запускаем генерацию окружения исходя из декоратора
        environment = SurfaceBuilder.getDefaultSet(skyMode).build();
        environment.illuminate();
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public SkyMode getSkyMode() {
        return skyMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Astronaut astronaut = (Astronaut) o;
        return skyMode == astronaut.skyMode &&
                environment.equals(astronaut.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skyMode, environment);
    }

    @Override
    public String toString() {
        String addedResult =
                skyMode != SkyMode.Space
                        ? "Вблизи также виднеется глубокая пещера, из которой только что вышли спутники"
                        : "";
//        return name + "\n" + "Состояние: " + condition +
//                skyMode.toString() + "\n" +
//                environment.getColor() + "\n" +
//                environment.getDescription().replaceFirst(",", ":") + "\n" + addedResult + "\n";

        return new Formatter().format("Имя: %s\n" +
                "Состояние: %s\n" +
                "Лидер: %b\n" +
                "Информация о скафандре: %s\n" +
                "Окружение: %s\n" +
                "Цвета окружения: %s\n" +
                "Описание: %s\n" +
                "%s",
                name,condition,isLeader,suit,skyMode,environment.getColor(),
                environment.getDescription().replaceFirst(",", ":"), addedResult)
                .toString() + "\nАстронафт включил прибор невесомости. Слышно жужжание\n";
    }

    // Пример вложенного класса
    public static class AstronautBuilder {
        private SkyMode skyMode;
        private String name;
        private StateOfHealth condition;
        private boolean isLeader;
        private SpaceSuit suit;

        public AstronautBuilder() {
            skyMode = SkyMode.MoonDay;
            name = "Not resolved";
            condition = StateOfHealth.NORMAL;
            isLeader = false;
            suit = new SpaceSuit();

        }

        public AstronautBuilder setSkyMode(SkyMode skyMode) {
            this.skyMode = skyMode;
            return this;
        }

        public AstronautBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AstronautBuilder setCondition(StateOfHealth condition) {
            this.condition = condition;
            return this;
        }

        public AstronautBuilder setLeader(boolean leader) {
            this.isLeader = leader;
            return this;
        }

        public AstronautBuilder setSuit(SpaceSuit suit) {
            this.suit = suit;
            return  this;
        }

        public Astronaut build() {
            return new Astronaut(name,skyMode,condition, isLeader,suit);
        }
    }
}
