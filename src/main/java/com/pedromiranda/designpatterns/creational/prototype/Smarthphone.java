package com.pedromiranda.designpatterns.creational.prototype;

public class Smarthphone extends Machine {
    private Boolean original;

    public Smarthphone() {
    }

    public Smarthphone(Smarthphone smartphone) {
        super(smartphone);
        this.original = smartphone.original;
    }

    @Override
    public Machine createClone() {
        return new Smarthphone(this);
    }

    public Boolean getOriginal() {
        return original;
    }

    public void setOriginal(Boolean original) {
        this.original = original;
    }

    @Override
    public String toString() {
        return "Smarthphone{" +
                "original=" + original +
                '}';
    }
}
