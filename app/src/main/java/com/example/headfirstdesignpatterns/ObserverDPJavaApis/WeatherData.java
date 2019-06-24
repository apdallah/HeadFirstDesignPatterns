package com.example.headfirstdesignpatterns.ObserverDPJavaApis;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    private float temp;
    private float pressure;
    private float humidty;

    public WeatherData() {

    }
    public void setMesurement(float temp, float pressure, float humidty) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidty = humidty;
        mesurementChanged();
    }

    private void mesurementChanged() {
        setChanged();
        notifyObservers(this);
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidty() {
        return humidty;
    }
}
