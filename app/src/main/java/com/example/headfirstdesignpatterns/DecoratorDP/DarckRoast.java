package com.example.headfirstdesignpatterns.DecoratorDP;

public class DarckRoast extends Bevarage {

    public DarckRoast() {
        description = "DarckRoast";
    }

    @Override
    public double getCost() {
        return 0.25;
    }
}
