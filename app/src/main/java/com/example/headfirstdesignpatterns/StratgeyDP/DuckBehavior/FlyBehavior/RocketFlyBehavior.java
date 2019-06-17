package com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.FlyBehavior;

import android.util.Log;

public class RocketFlyBehavior implements FlayBehavior {
    @Override
    public void fly() {
        Log.i("Rocket", "fly: Roucket Fly");
    }
}
