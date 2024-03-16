package com.pedromiranda.designpatterns.creational.factory;

public class PessoaAdulta extends Pessoa {
    private Boolean casado;

    public PessoaAdulta(Boolean casado) {
        this.casado = casado;
    }
}
