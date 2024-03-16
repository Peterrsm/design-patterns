package com.pedromiranda.designpatterns.creational.builder;

public class BookBuilder {

    private Book book;

    private BookBuilder() {
        book = new Book();
    }

    public static BookBuilder builder(){
        return new BookBuilder();
    }

    public BookBuilder autor(String autor){
        this.book.setAutor(autor);
        return this;
    }

    public BookBuilder name(String name){
        this.book.setName(name);
        return this;
    }

    public BookBuilder id(int id){
        this.book.setId(id);
        return this;
    }

    public BookBuilder pages(int pages){
        this.book.setPages(pages);
        return this;
    }

    public BookBuilder year(int year){
        this.book.setYear(year);
        return this;
    }

    public Book build(){
        return this.book;
    }

}
