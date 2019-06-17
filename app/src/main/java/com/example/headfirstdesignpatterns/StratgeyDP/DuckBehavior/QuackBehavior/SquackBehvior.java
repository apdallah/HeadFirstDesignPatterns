package com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.QuackBehavior;

import android.util.Log;

public class SquackBehvior implements QuackBehavior {
    @Override
    public void quack() {
        Log.i("SQuack", "quack: squack");
    }
}
