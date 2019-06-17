package com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.QuackBehavior;

import android.util.Log;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        Log.i("Quack", "quack: quack");

    }
}
