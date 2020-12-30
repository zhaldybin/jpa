package com.zhaldybin.jpa.inheritance.joined;

public class InheritanceExample {

    public static void main(String... args) {
        Book3 book = new Book3();
        book.setTitle("Men at arms");
        book.setAuthor("Terry Pratchett");
        book.setIsbn("240384u23o4u12u42");
        new BookRepository().save(book);

        CD3 cd = new CD3();
        cd.setTitle("Rubber Soul");
        cd.setMusicians("Lennon, McCartney, Starr");
        new CDRepository().save(cd);
    }
}
