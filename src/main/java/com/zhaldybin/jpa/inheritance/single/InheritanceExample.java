package com.zhaldybin.jpa.inheritance.single;

public class InheritanceExample {

    public static void main(String... args) {
        Book1 book = new Book1();
        book.setTitle("Men at arms");
        book.setAuthor("Terry Pratchett");
        book.setIsbn("240384u23o4u12u42");
        new BookRepository().save(book);

        CD1 cd = new CD1();
        cd.setTitle("Rubber Soul");
        cd.setMusicians("Lennon, McCartney, Starr");
        new CDRepository().save(cd);
    }
}
