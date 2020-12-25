package com.zhaldybin.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ConcertRepository {

    public Concert save(Concert concert) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(concert);
        transaction.commit();
        return concert;
    }
}
