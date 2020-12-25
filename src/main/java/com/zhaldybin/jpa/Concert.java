package com.zhaldybin.jpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Concert {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate date;

    @OneToMany
    private Set<Musician> musicians;
}
