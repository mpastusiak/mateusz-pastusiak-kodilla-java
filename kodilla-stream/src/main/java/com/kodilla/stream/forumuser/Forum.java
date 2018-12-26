package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        theUsersList.add(new ForumUser(1, "Jan Kowalski", 'M', LocalDate.of(1990, 8, 16), 25));
        theUsersList.add(new ForumUser(2, "Adam Nowak", 'M', LocalDate.of(1992, 8, 16), 15));
        theUsersList.add(new ForumUser(3, "Ignacy Kowalczyk", 'M', LocalDate.of(1994, 8, 16), 5));
        theUsersList.add(new ForumUser(4, "Maurycy Lipski", 'M', LocalDate.of(1996, 8, 16), 0));
        theUsersList.add(new ForumUser(5, "Dorian Malinowski", 'M', LocalDate.of(1998, 8, 16), 0));
        theUsersList.add(new ForumUser(6, "Mateusz Zieliński", 'M', LocalDate.of(2000, 8, 16), 5));
        theUsersList.add(new ForumUser(7, "Marcin Skalski", 'M', LocalDate.of(2002, 8, 16), 10));
        theUsersList.add(new ForumUser(8, "Bogdan Piotrowski", 'M', LocalDate.of(2004, 8, 16), 15));
        theUsersList.add(new ForumUser(9, "Janusz Kołodziej", 'M', LocalDate.of(1991, 8, 16), 10));
        theUsersList.add(new ForumUser(10, "Emilia Ratajczak", 'K', LocalDate.of(1993, 8, 16), 25));
        theUsersList.add(new ForumUser(11, "Anna Nowak", 'K', LocalDate.of(1995, 8, 16), 50));
        theUsersList.add(new ForumUser(12, "Janina Kowalska", 'K', LocalDate.of(1997, 8, 16), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUsersList);
    }
}
