package com.example.headfirstdesignpatterns.ObserverDP;

import java.util.ArrayList;

public class WeatherData implements Subject {
    ArrayList<Observer> observers;
    private float temp;
    private float pressure;
    private float humidty;

    public WeatherData() {
        observers = new ArrayList<>();

    }

    @Override
    public void register(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void remove(Observer ob) {
        int index = observers.indexOf(ob);
        if (index > 0) observers.remove(index);
    }

    @Override
    public void notifiyAll() {
        for (Observer observer : observers) {
            observer.update(temp, pressure, humidty);
        }
    }

    public void setMesurement(float temp,float pressure,float humidty){
        this.temp=temp;
        this.pressure=pressure;
        this.humidty=humidty;
        mesurementChanged();
    }
    private void mesurementChanged(){
        notifiyAll();
    }

}
