package com.zhaldybin.jdbc;

import lombok.Data;

@Data
public class Book {
    Long id;
    String title;
    String author;
    String description;
    Float cost;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title.trim() + '\'' +
                ", author='" + author.trim() + '\'' +
                ", description='" + description.trim() + '\'' +
                ", cost=" + cost +
                '}';
    }
}
