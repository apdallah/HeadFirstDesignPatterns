package com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.FlyBehavior;

import android.util.Log;

public class NoFlayBehavior implements FlayBehavior {
    @Override
    public void fly() {
        Log.i("NoFlay", "fly: can't fly");
    }
}
