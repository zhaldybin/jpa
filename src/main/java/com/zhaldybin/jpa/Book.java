package com.zhaldybin.jpa;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "books")
@NamedQuery(name = "expensiveBooks", query = "SELECT b FROM Book b WHERE b.cost > 10.0f")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    String title;

    String author;

    @Column(length = 65536)
    String description;

    Float cost;
}
