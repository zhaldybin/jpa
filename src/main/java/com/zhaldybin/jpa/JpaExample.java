package com.zhaldybin.jpa;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JpaExample {

    public static void main(String... args) {
        BookRepository repository = new BookRepository();
        Book book = new Book();
        book.setAuthor("author");
        book.setTitle("title");
        book.setDescription("description");
        book.setCost(12f);
        Book savedBook = repository.save(book);
        log.info("Saved book: {}", savedBook);
    }
}
