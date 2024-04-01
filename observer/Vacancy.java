package ru.geekbrains.oop.lesson7.observer;

public class Vacancy {

    private String name;

    private int minSalary;

    private int maxSalary;

    public Vacancy(String name, int minSalary, int maxSalary) {
        this.name = name;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public String getName() {
        return name;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
