package com.example.headfirstdesignpatterns.ObserverDP;

public interface Subject {
    void register(Observer ob);
    void remove(Observer ob);
    void notifiyAll();
}
