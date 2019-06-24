package com.example.headfirstdesignpatterns.FactoryDP.ChicagoPizas;

import android.util.Log;

import com.example.headfirstdesignpatterns.FactoryDP.Pizza;

public class ChigacoCheckenPizza implements Pizza {
    public static final String TAG="ChigacoCheckenPizza";
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
