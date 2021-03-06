package com.zhaldybin.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BookRepository {

    public Book save(Book book) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(book);
        transaction.commit();
        return book;
    }

}
