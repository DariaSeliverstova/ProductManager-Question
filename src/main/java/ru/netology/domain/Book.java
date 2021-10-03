package ru.netology.domain;

import java.util.Objects;

public class Book extends Product {

    private String avtor;


    public Book(String name, int id, int price, String avtor) {
        super(name, id, price);
        this.avtor = avtor;
    }

    public Book(String avtor) {
        this.avtor = avtor;
    }

    public Book() {

    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(avtor, book.avtor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), avtor);
    }
}

