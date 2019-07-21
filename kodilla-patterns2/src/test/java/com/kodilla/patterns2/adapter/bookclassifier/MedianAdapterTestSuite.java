package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Różni", "Biblia", 1895, "R-B-001");
        Book book2 = new Book("Adam Mickiewicz", "Pan Tadeusz", 1990, "AM-PT-245");
        Book book3 = new Book("Stephen King", "Lśnienie", 1990, "SK-L-028");
        Book book4 = new Book("Andrzej Jacek Blikle", "Doktryna Jakości", 2000, "AJB-DJ-111");
        Book book5 = new Book("Jan Kowalski", "Mały Szary Człowiek", 2019, "JK-MSC-013");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int bookMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1990,bookMedian);
    }
}
