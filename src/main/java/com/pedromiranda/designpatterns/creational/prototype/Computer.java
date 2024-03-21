package com.pedromiranda.designpatterns.creational.prototype;

public class Computer extends Machine {

    private int year;

    public Computer() {
    }

    public Computer(Computer cpmputer) {
        super(cpmputer);
        this.year = cpmputer.year;
    }

    @Override
    public Computer createClone() {
        return new Computer(this);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "year=" + year +
                '}';
    }
}
