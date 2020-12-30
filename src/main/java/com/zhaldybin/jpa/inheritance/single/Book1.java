package com.zhaldybin.jpa.inheritance.single;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
class Book1 extends Item1 {

    private String author;
    private String isbn;
}
