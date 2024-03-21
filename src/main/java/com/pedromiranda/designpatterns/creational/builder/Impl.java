package com.pedromiranda.designpatterns.creational.builder;

public class Impl {

    public void implement() {
        Book livro = BookBuilder.builder()
                .autor("F. Herbert")
                .name("Dune")
                .year(1965)
                .build();

        System.out.println(livro);
    }
}
