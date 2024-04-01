package ru.geekbrains.oop.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;

    private Publisher jobAgency;


    public Company(String name, Publisher jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(Vacancy vacancy){
        int salary = random.nextInt(vacancy.getMinSalary(), vacancy.getMaxSalary());
        jobAgency.sendOffer(name, vacancy);
    }
}
