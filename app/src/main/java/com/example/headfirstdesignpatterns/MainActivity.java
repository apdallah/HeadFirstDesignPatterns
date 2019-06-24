package com.example.headfirstdesignpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.headfirstdesignpatterns.DecoratorDP.Bevarage;
import com.example.headfirstdesignpatterns.DecoratorDP.Esspresso;
import com.example.headfirstdesignpatterns.DecoratorDP.Milk;
import com.example.headfirstdesignpatterns.DecoratorDP.Mocha;
import com.example.headfirstdesignpatterns.FactoryDP.ChicagoPizzaStore;
import com.example.headfirstdesignpatterns.FactoryDP.NYPizzaStore;
import com.example.headfirstdesignpatterns.FactoryDP.PizzaStore;
import com.example.headfirstdesignpatterns.ObserverDP.CurrentConditionDisplay;
import com.example.headfirstdesignpatterns.ObserverDPJavaApis.WeatherData;
import com.example.headfirstdesignpatterns.ObserverDPJavaApis.CurrentCondition;
import com.example.headfirstdesignpatterns.StratgeyDP.Duck;
import com.example.headfirstdesignpatterns.StratgeyDP.DuckBehavior.FlyBehavior.RocketFlyBehavior;
import com.example.headfirstdesignpatterns.StratgeyDP.MallerdDuck;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Stratgey DP Test
//        Duck mallerdDuck = new MallerdDuck();
//        mallerdDuck.display();
//        mallerdDuck.performQuack();
//        mallerdDuck.performFly();
//        ((MallerdDuck) mallerdDuck).setFlayBehavior(new RocketFlyBehavior());
//        mallerdDuck.performFly();
        //Observer DP Test
//        WeatherData weatherData = new WeatherData();
//        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        //ObserverDp using Java APIS TEST
//        WeatherData weatherData=new WeatherData();
//        CurrentCondition currentCondition=new CurrentCondition(weatherData);
//        weatherData.setMesurement(5.0f, 3.0f, 2.0f);
//        weatherData.setMesurement(7.0f, 8.0f, 9.0f);
        //Decorator Pattern TEST
//        Bevarage bevarage=new Esspresso();
//        bevarage.setSize("large");
//        bevarage=new Milk(bevarage);
//        bevarage=new Mocha(bevarage);
//        Log.i("MAinAct", "onCreate: "+bevarage.getDescription()+bevarage.getCost());

        //Factory Design Pattern TEST
//        PizzaStore pizzaStore = new NYPizzaStore();
//        pizzaStore.orderPizza("veggie");
//
//        pizzaStore = new ChicagoPizzaStore();
//
//        pizzaStore.orderPizza("veggie");

    }
}
