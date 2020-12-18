package com.zhaldybin.jpa;

public class JpaExample {

    public static void main(String... args) {
        BookRepository repository = new BookRepository();
        Book book = new Book();
        book.setAuthor("author");
        book.setTitle("title");
        book.setDescription("description");
        book.setCost(12f);
        repository.save(book);
    }
}
