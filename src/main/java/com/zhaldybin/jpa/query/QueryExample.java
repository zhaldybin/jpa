package com.zhaldybin.jpa.query;

import com.zhaldybin.jpa.Book;
import com.zhaldybin.jpa.BookRepository;
import com.zhaldybin.jpa.EntityManagerProvider;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class QueryExample {

    public static void main(String... args) {
        BookRepository repository = new BookRepository();
        Book book = new Book();
        book.setAuthor("author");
        book.setTitle("title");
        book.setDescription("description");
        book.setCost(12f);
        Book savedBook = repository.save(book);

        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        Query query = entityManager.createQuery("SELECT b FROM Book b WHERE b.title = ?1");
        query.setParameter(1, "title");
        List books = query.getResultList();
        books.forEach(b -> {
            log.info("found book by query: {}", b);
        });

        TypedQuery<Book> typedQuery = entityManager.createQuery("SELECT b FROM Book b WHERE b.title = ?1", Book.class);
        typedQuery.setParameter(1, "title");
        List<Book> books1 = typedQuery.getResultList();
        books1.forEach(b -> {
            log.info("found book by typed query: {}", b);
        });

        TypedQuery<Book> typedQueryParamName = entityManager.createQuery("SELECT b FROM Book b WHERE b.title = :title " +
                "AND b.cost > :cost", Book.class);
        typedQueryParamName.setParameter("title", "title");
        typedQueryParamName.setParameter("cost", 10.0f);
        List<Book> books2 = typedQuery.getResultList();
        books2.forEach(b -> {
            log.info("found book by typed query with named parameters: {}", b);
        });

        // Named query
        TypedQuery<Book> namedQuery = entityManager.createNamedQuery("expensiveBooks", Book.class);
        Stream<Book> bookStream = namedQuery.getResultStream();
        bookStream.forEach(b -> {
            log.info("found book by named query: {}", b);
        });
    }
}
