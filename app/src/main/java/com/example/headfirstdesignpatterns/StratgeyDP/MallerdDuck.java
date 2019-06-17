package com.example.headfirstdesignpatterns.StratgeyDP;

import android.util.Log;

import com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.FlyBehavior.FlayBehavior;
import com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.FlyBehavior.NoFlayBehavior;
import com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.QuackBehavior.Quack;
import com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.QuackBehavior.QuackBehavior;

public class MallerdDuck extends Duck {

    public MallerdDuck() {
        flayBehavior = new NoFlayBehavior();
        quackBehavior = new Quack();
    }

    public void setQuakBehvior(QuackBehavior quakBehvior) {
        this.quackBehavior = quakBehvior;
    }

    public void setFlayBehavior(FlayBehavior flayBehavior) {
        this.flayBehavior = flayBehavior;
    }

    @Override
    public void display() {
        Log.i("MAllerdDuck", "display: mallered duck");
    }

}
