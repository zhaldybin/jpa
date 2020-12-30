package com.zhaldybin.jpa.inheritance.single;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
class CD1 extends Item1 {

    private String musicians;
}
