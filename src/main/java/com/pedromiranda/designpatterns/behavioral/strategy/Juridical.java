package com.pedromiranda.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Juridical implements IDocumentStrategy {
    private String cnpj;

    @Override
    public String getDocument() {
        return this.cnpj;
    }
}
