package com.zhaldybin.jpa.inheritance.mappedsuperclass;

public class InheritanceExample {

    public static void main(String... args) {
        Book4 book = new Book4();
        book.setTitle("Men at arms");
        book.setAuthor("Terry Pratchett");
        book.setIsbn("240384u23o4u12u42");
        new BookRepository().save(book);

        CD4 cd = new CD4();
        cd.setTitle("Rubber Soul");
        cd.setMusicians("Lennon, McCartney, Starr");
        new CDRepository().save(cd);
    }
}
