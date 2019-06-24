package com.example.headfirstdesignpatterns.FactoryDP;

import com.example.headfirstdesignpatterns.FactoryDP.ChicagoPizas.ChigacoCheckenPizza;
import com.example.headfirstdesignpatterns.FactoryDP.ChicagoPizas.ChigacoVeggiePizza;
import com.example.headfirstdesignpatterns.FactoryDP.NYPizzaes.NYCheckinPizza;
import com.example.headfirstdesignpatterns.FactoryDP.NYPizzaes.NYVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizze(String PizzaType) {
        Pizza pizza=null;
        if(PizzaType.equalsIgnoreCase("veggie")){
            pizza=new ChigacoVeggiePizza();

        }else if(PizzaType.equalsIgnoreCase("chechen")){
            pizza=new ChigacoCheckenPizza();
        }
        return pizza;
    }
}
