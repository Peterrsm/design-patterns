package com.pedromiranda.designpatterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {
    private String nome;
    private String tipo_produto;

    private static Produto instance;

    private Produto(String nome, String tipo_produto) {
        this.nome = nome;
        this.tipo_produto = tipo_produto;
    }

    private Produto() {
    }

    public static Produto getInstance() {
        if (instance == null) {
            instance = new Produto();
            return instance;
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", tipo_produto='" + tipo_produto + '\'' +
                '}';
    }
}
