package com.example.headfirstdesignpatterns.ObserverDP;

import android.util.Log;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    Subject weatherData;
    private float temprture;
    private float humidity;

    public CurrentConditionDisplay(Subject watherData) {
        this.weatherData = watherData;
        weatherData.register(this);

    }


    @Override
    public void display() {
        Log.i("CurrentConditions", "display: " + temprture + "::" + humidity);
    }

    @Override
    public void update(float temp, float peresure, float humidty) {
        this.temprture = temp;
        this.humidity = humidty;
        display();
    }
}
