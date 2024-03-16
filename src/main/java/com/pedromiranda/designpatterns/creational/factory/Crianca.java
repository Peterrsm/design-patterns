package com.pedromiranda.designpatterns.creational.factory;

public class Crianca extends Pessoa {
    private Boolean sabe_falar;

    public Crianca(Boolean sabe_falar) {
        this.sabe_falar = sabe_falar;
    }
}