package com.example.headfirstdesignpatterns.ObserverDPJavaApis;


import android.util.Log;

import com.example.headfirstdesignpatterns.ObserverDP.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentCondition implements Observer, DisplayElement {

    WeatherData weatherData;
    private float temprture;
    private float humidity;

    public CurrentCondition(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
     }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherData) {
            temprture = ((WeatherData) arg).getTemp();
            humidity = ((WeatherData) arg).getHumidty();
            display();
        }
    }

    public void display() {
        Log.i("CurrentConditions", "display: " + temprture + "::" + humidity);
    }

}
