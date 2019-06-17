package com.example.headfirstdesignpatterns.StratgeyDP;

import com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.FlyBehavior.FlayBehavior;
import com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.QuackBehavior.QuackBehavior;

public abstract class Duck {
    FlayBehavior flayBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }
    public abstract void display();
    public void performFly(){
        flayBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

}
