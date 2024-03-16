package com.pedromiranda.designpatterns.creational.builder;

public class Book {
    private String autor;
    private String name;
    private int id;
    private int pages;
    private int year;

    protected void setAutor(String autor) {
        this.autor = autor;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setPages(int pages) {
        this.pages = pages;
    }

    protected void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();

        retorno.append("Book{");

        retorno.append("autor='" + autor + '\'');
        retorno.append(", name='" + name + '\'');
        retorno.append(", pages=" + pages + '\'');
        retorno.append(", year=" + year + "}");
        return retorno.toString();
    }
}
