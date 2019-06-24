package com.example.headfirstdesignpatterns.FactoryDP;

public abstract class PizzaStore {
    public void orderPizza(String pizzaType){
        Pizza pizza=createPizze(pizzaType);
        pizza.prepare();
        pizza.cook();
        pizza.cut();
        pizza.box();

    }
    abstract Pizza createPizze(String PizzaType);
}
