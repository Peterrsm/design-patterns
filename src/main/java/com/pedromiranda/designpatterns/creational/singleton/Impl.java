package com.pedromiranda.designpatterns.creational.singleton;

public class Impl {
    public void implement() {
        Produto produto = Produto.getInstance();
        produto.setNome("Livro GoF");
        System.out.println("Produto 1:");
        System.out.println(produto);

        System.out.println();

        Produto segundo_prod = Produto.getInstance();
        System.out.println("Produto 2:");
        segundo_prod.setTipo_produto("Livro");

        System.out.println(segundo_prod);
    }
}
