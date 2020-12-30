package com.zhaldybin.jpa.inheritance.tableperclass;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
class CD2 extends Item2 {

    private String musicians;
}
