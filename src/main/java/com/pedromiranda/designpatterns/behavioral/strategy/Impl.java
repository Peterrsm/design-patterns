package com.pedromiranda.designpatterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Impl {

    public void implement() {
        Fisical pessoa_fisica = new Fisical("123.456.789-10");
        Juridical pessoa_juridica = new Juridical("24.988.907/0001-79\n");

        showDocument(pessoa_juridica);
    }

    private void showDocument(IDocumentStrategy pessoa) {
        log.info(pessoa.getDocument());
    }
}