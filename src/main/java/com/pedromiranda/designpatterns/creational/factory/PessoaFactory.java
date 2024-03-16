package com.pedromiranda.designpatterns.creational.factory;

public class PessoaFactory {

    private PessoaFactory() {

    }

    public static Pessoa getInstance(Boolean adulto) {
        return adulto ? new PessoaAdulta(Boolean.FALSE) : new Crianca(Boolean.FALSE);
    }
}
