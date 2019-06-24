package com.example.headfirstdesignpatterns.DecoratorDP;

public class HouseBlend extends Bevarage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
  public   double getCost() {
        return 0.25;
    }
}
