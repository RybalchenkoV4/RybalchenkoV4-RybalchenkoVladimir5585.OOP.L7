package ru.geekbrains.oop.lesson7.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class JobAgency implements Publisher{

    Random random = new Random();
    private Collection<Observer> observers = new ArrayList<>();

    public void sendOffer(String companyName, Vacancy vacancy) {
        for (Observer observer : observers)
            observer.receiveOffer(companyName, vacancy);
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
