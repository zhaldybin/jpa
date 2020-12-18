package com.zhaldybin.jdbc;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
public class JdbcExample {

    public static void main(String... args) throws SQLException {
        createTable();
        Book book = new Book();
        book.setId(1L);
        book.setAuthor("Stephen King");
        book.setTitle("It");
        book.setDescription("Cool book");
        book.setCost(13.99F);
        persistBook(book);
        Book selectedBook = getBook(1);
        log.info("Selected book: {}", selectedBook);
    }

    private static Book getBook(long id) {
        String query = "SELECT * FROM books WHERE id = ?;";
        try (var statement = getConnection().prepareStatement(query)) {
            statement.setLong(1, id);
            var result = statement.executeQuery();
            if (result.next()) {
                Book book = new Book();
                book.setId(result.getLong(1));
                book.setTitle(result.getString(2));
                book.setAuthor(result.getString(3));
                book.setDescription(result.getString(4));
                book.setCost(result.getFloat(5));
                return book;
            } else {
                throw new RuntimeException(String.format("Book with id %d not found", id));
            }
        } catch (SQLException e) {
            log.error("Error selecting book", e);
            throw new RuntimeException(e);
        }
    }

    private static void createTable() throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS books (id INT PRIMARY KEY NOT NULL," +
                "title CHAR(255) NOT NULL, author CHAR(255) NOT NULL," +
                "description CHAR(1024), cost REAL NOT NULL);";
        var connection = getConnection();
        var statement = connection.createStatement();
        statement.execute(query);
    }

    private static void persistBook(Book book) {
        String query = "INSERT INTO books VALUES (?, ?, ?, ?, ?) " +
                "ON CONFLICT DO NOTHING;";
        try (var statement = getConnection().prepareStatement(query)) {
            statement.setLong(1, book.getId());
            statement.setString(2, book.getTitle());
            statement.setString(3, book.getAuthor());
            statement.setString(4, book.getDescription());
            statement.setFloat(5, book.getCost());
            statement.execute();
        } catch (SQLException e) {
            log.error("Error persisting a book", e);
        }
    }

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection getConnection() {
        try {
            String url = "jdbc:postgresql://localhost/test?user=testuser&password=test123";
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            log.error("Error creating database connection", e);
            throw new RuntimeException(e);
        }
    }
}
