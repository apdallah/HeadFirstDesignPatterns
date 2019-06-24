package com.example.headfirstdesignpatterns.DecoratorDP;

public class Milk extends BevarageDecorator {
    Bevarage bevarage;

    public Milk(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        double cost = bevarage.getCost();
        switch (bevarage.getSize()) {
            case "small":
                cost += 0.10;
                break;
            case "mediume":
                cost += 0.20;
                break;
            case "large":
                cost += 0.30;
                break;

        }
        return cost;
    }
}
