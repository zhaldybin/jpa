package com.zhaldybin.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String title;

    String author;

    @Column(length = 65536)
    String description;

    Float cost;
}
