package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getSexOfUser() == 'M')
                .filter(user -> ChronoUnit.YEARS.between(user.getUserDOB(), LocalDate.now()) >= 20)
                .filter(user -> user.getNumberOfUserPosts() >= 1)
                .collect(Collectors.toMap(ForumUser :: getUserID, user -> user));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out :: println);
    }
}
