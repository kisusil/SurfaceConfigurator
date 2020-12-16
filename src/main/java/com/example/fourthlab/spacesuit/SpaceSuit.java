package com.example.fourthlab.spacesuit;

import java.util.ArrayList;
import java.util.List;

public class SpaceSuit {

    private boolean isEnabled;

    private List<Tool> tools;

    public SpaceSuit() {
        this.isEnabled = false;
        tools = new ArrayList<>();
        tools.add(new Alpenstock());
        tools.add(new GeologicalHammer());
        tools.add(new IceAx());
        tools.add(new Propeller());
        tools.add(new RadioPhone());
        tools.add(new WeightlessnessDevice());

        // Пример анонимного класса
        addOwnTool(new Tool() {
            @Override
            public void doWork() {
                System.out.println("Какая-то непонятная вещь");
            }

            @Override
            public String toString() {
                return "Какая-то непонятная вещь";
            }
        });
    }

    public void enableButton() {
        isEnabled = isEnabled ? false : true;
        System.out.println("Космонавт включил свой скафандр. Слышно жужжание - это заработал пропеллер");
    }
    public boolean getEnabled() {
        return isEnabled;
    }

    public void addOwnTool(Tool tool) {
        tools.add(tool);
    }

    @Override
    public String toString() {
        return "На костюме подвешаны: " + tools.toString().substring(1, tools.toString().length()-1);
    }
}
