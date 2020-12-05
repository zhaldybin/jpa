package com.zhaldybin.jdbc;

import lombok.Data;

@Data
public class Book {
    Long id;
    String title;
    String author;
    String description;
    Float cost;
}
