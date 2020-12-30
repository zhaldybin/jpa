package com.zhaldybin.jpa.inheritance.tableperclass;

public class InheritanceExample {

    public static void main(String... args) {
        Book2 book = new Book2();
        book.setTitle("Men at arms");
        book.setAuthor("Terry Pratchett");
        book.setIsbn("240384u23o4u12u42");
        new BookRepository().save(book);

        CD2 cd = new CD2();
        cd.setTitle("Rubber Soul");
        cd.setMusicians("Lennon, McCartney, Starr");
        new CDRepository().save(cd);
    }
}
