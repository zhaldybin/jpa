package com.zhaldybin.jpa.inheritance.mappedsuperclass;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
class Book4 extends Item4 {

    private String author;
    private String isbn;
}
