package com.example.headfirstdesignpatterns.DecoratorDP;

public class Mocha extends BevarageDecorator {
    Bevarage bevarage;

    public Mocha(Bevarage bevarage) {
        this.bevarage = bevarage;
    }

    @Override
    public String getDescription() {
        return bevarage.getDescription() + ", Mocha";
    }

    @Override
   public double getCost() {
        return bevarage.getCost() + 0.1;
    }
}
