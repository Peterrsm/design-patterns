package com.pedromiranda.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Fisical implements IDocumentStrategy {
    private String cpf;

    @Override
    public String getDocument() {
        return this.cpf;
    }
}
