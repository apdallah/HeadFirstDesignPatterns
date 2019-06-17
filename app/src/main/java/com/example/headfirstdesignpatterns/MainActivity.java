package com.example.headfirstdesignpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.headfirstdesignpatterns.StratgeyDP.Duck;
import com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.FlyBehavior.RocketFlyBehavior;
import com.example.headfirstdesignpatterns.StratgeyDP.MallerdDuck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Duck mallerdDuck = new MallerdDuck();
        mallerdDuck.display();
        mallerdDuck.performQuack();
        mallerdDuck.performFly();
        ((MallerdDuck) mallerdDuck).setFlayBehavior(new RocketFlyBehavior());
        mallerdDuck.performFly();
    }
}
