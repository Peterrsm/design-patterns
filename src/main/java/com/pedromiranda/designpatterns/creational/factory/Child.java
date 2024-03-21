package com.pedromiranda.designpatterns.creational.factory;

public class Child extends Person {
    private Boolean sabe_falar;

    public Child(Boolean sabe_falar) {
        this.sabe_falar = sabe_falar;
    }

    @Override
    public String toString() {
        return "Child{" +
                "sabe_falar=" + sabe_falar +
                '}';
    }
}