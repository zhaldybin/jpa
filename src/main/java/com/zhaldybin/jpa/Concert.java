package com.zhaldybin.jpa;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Concert {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate date;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Musician> musicians;
}
