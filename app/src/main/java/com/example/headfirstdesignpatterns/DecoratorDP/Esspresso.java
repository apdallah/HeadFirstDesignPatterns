package com.example.headfirstdesignpatterns.DecoratorDP;

public class Esspresso extends Bevarage {

    public Esspresso() {
        description = "Esspresso";
    }

    @Override
   public double getCost() {
        return 0.99;
    }
}
