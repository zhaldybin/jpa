package com.zhaldybin.jpa.inheritance.single;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
class Item1 {

    @Id
    @GeneratedValue
    protected Long id;

    protected String title;
}
