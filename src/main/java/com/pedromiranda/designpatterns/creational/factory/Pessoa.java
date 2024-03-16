package com.pedromiranda.designpatterns.creational.factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pessoa {
    private String nome;
    private String sobrenome;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
