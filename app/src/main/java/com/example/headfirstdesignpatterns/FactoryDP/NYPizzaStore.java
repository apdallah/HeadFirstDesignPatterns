package com.example.headfirstdesignpatterns.FactoryDP;

import com.example.headfirstdesignpatterns.FactoryDP.NYPizzaes.NYCheckinPizza;
import com.example.headfirstdesignpatterns.FactoryDP.NYPizzaes.NYVeggiePizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizze(String PizzaType) {
        Pizza pizza=null;
        if(PizzaType.equalsIgnoreCase("veggie")){
            pizza=new NYVeggiePizza();

        }else if(PizzaType.equalsIgnoreCase("chechen")){
            pizza=new NYCheckinPizza();
        }
        return pizza;
    }
}
