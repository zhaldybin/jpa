package com.zhaldybin.jpa.inheritance.mappedsuperclass;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
class Item4 {

    @Id
    @GeneratedValue
    protected Long id;

    protected String title;
}
