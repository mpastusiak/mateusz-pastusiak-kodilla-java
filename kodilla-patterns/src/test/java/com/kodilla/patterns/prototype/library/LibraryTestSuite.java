package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Set<Book> books = new HashSet<>();

        for (int i = 0; i < 12; i++) {
            String title = "Book number " + i;
            String author = "Author number " + i;
            LocalDate date = LocalDate.of(2019 - i, 1 + i, 28 - i);

            books.add(new Book(title, author, date));
        }

        //making object library
        Library library = new Library("Library number 1");
        library.getBooks().addAll(books);

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().removeAll(books);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(0, clonedLibrary.getBooks().size());
        Assert.assertEquals(12, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
