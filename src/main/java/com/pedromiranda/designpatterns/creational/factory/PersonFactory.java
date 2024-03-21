package com.pedromiranda.designpatterns.creational.factory;

public class PersonFactory {

    private PersonFactory() {

    }

    public static Person getInstance(Boolean adulto) {
        return adulto ? new Adult(Boolean.FALSE) : new Child(Boolean.FALSE);
    }
}
