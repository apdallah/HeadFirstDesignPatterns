package com.example.headfirstdesignpatterns.DecoratorDP;

public class Soya extends BevarageDecorator {
    Bevarage bevarage;

    public Soya(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Soya";
    }

    @Override
   public double getCost() {
        return bevarage.getCost() + 0.2;
    }
}
