package com.pedromiranda.designpatterns.creational.factory;

public class Adult extends Person {
    private Boolean casado;

    public Adult(Boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "casado=" + casado +
                '}';
    }
}
