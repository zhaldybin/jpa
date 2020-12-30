package com.zhaldybin.jpa.inheritance.mappedsuperclass;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
class CD4 extends Item4 {

    private String musicians;
}
