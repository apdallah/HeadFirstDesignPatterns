package com.example.headfirstdesignpatterns.FactoryDP.NYPizzaes;

import android.util.Log;

import com.example.headfirstdesignpatterns.FactoryDP.Pizza;

public class NYCheckinPizza implements Pizza {
    private final String TAG="NYCheckinPizza";
    @Override
    public void prepare() {
        Log.i(TAG, "prepare: ");
    }

    @Override
    public void cook() {
        Log.i(TAG, "cook: ");
    }

    @Override
    public void cut() {
        Log.i(TAG, "cut: ");
    }

    @Override
    public void box() {
        Log.i(TAG, "box: ");
    }
}
