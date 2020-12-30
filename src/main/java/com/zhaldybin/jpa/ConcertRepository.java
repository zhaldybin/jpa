package com.zhaldybin.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcertRepository {

    public Concert save(Concert concert) {
        log.info("saving concert {}", concert);
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(concert);
        transaction.commit();
        log.info("concert saved: {}", concert);
        return concert;
    }
}
