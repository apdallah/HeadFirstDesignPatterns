package com.example.headfirstdesignpatterns.DecoratorDP;

public abstract class Bevarage {
    String description = "Unknown Description";
    String size = "small";

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract double getCost();
}
