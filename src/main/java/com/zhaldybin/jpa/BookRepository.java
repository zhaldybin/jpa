package com.zhaldybin.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookRepository {

    private final EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-persistence-unit");
    private final EntityManager entityManager = factory.createEntityManager();
    private final EntityTransaction transaction = entityManager.getTransaction();

    public Book save(Book book) {
        transaction.begin();
        entityManager.merge(book);
        transaction.commit();
        return book;
    }

}
