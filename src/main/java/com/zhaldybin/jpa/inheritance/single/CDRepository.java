package com.zhaldybin.jpa.inheritance.single;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.zhaldybin.jpa.EntityManagerProvider;

public class CDRepository {

    public CD1 save(CD1 cd) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(cd);
        transaction.commit();
        return cd;
    }
}
