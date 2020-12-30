package com.zhaldybin.jpa.inheritance.joined;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
class CD3 extends Item3 {

    private String musicians;
}
