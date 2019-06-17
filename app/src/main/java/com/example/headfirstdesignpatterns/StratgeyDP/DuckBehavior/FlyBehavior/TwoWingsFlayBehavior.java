package com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.FlyBehavior;

import android.util.Log;

public class TwoWingsFlayBehavior implements FlayBehavior {
    @Override
    public void fly() {
        Log.i("TwoWingsFlayBehavior", "fly: Two Wings Fly");
    }
}
