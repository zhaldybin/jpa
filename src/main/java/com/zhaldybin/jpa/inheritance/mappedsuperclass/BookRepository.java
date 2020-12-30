package com.zhaldybin.jpa.inheritance.mappedsuperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.zhaldybin.jpa.EntityManagerProvider;

public class BookRepository {

    public Book4 save(Book4 book) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(book);
        transaction.commit();
        return book;
    }

}
