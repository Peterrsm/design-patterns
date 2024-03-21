package com.pedromiranda.designpatterns.creational.factory;

public class Impl {

    public void implement() {
        Person person = PersonFactory.getInstance(false);

        System.out.println(person);
    }
}
