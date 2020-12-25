package com.zhaldybin.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-persistence-unit");
    private static final EntityManager entityManager = factory.createEntityManager();

    public static EntityManager getEntityManager() {
        return entityManager;
    }
}
