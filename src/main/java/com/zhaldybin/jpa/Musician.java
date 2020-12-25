package com.zhaldybin.jpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Musician {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private Concert concert;
}
