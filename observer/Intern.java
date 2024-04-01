package ru.geekbrains.oop.lesson7.observer;

import java.util.Random;

public class Intern implements Observer{

    private String name;
    private int salary;

    public Intern(String name){
        this.name = name;
        salary = 30000;
    }

    @Override
    public void receiveOffer(String nameCompany,Vacancy vacancy) {
        Random random = new Random();
        int salary = random.nextInt(vacancy.getMinSalary(), vacancy.getMaxSalary());
        if (this.salary <= salary){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }

}
