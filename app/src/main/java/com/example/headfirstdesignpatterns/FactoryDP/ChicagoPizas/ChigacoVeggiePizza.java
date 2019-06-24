package com.example.headfirstdesignpatterns.FactoryDP.ChicagoPizas;

import android.util.Log;

import com.example.headfirstdesignpatterns.FactoryDP.Pizza;

public class ChigacoVeggiePizza implements Pizza {
    public static final  String TAG="ChigacoVeggiePizza";
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
