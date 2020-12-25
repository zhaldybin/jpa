package com.zhaldybin.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class MusicianRepository {

    public Musician save(Musician musician) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(musician);
        transaction.commit();
        return musician;
    }
}
