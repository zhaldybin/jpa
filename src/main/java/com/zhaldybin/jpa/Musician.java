package com.zhaldybin.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Musician {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
