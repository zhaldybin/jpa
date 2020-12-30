package com.zhaldybin.jpa.inheritance.joined;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.zhaldybin.jpa.EntityManagerProvider;

public class BookRepository {

    public Book3 save(Book3 book) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(book);
        transaction.commit();
        return book;
    }

}
