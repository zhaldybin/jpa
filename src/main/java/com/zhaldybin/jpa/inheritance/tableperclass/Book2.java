package com.zhaldybin.jpa.inheritance.tableperclass;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
class Book2 extends Item2 {

    private String author;
    private String isbn;
}
