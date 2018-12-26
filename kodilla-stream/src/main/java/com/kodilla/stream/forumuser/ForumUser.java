package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sexOfUser;
    private final LocalDate userDOB;
    private final int numberOfUserPosts;

    public ForumUser(final int userID, final String userName, final char sexOfUser, final LocalDate userDOB, final int numberOfUserPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sexOfUser = sexOfUser;
        this.userDOB = userDOB;
        this.numberOfUserPosts = numberOfUserPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSexOfUser() {
        return sexOfUser;
    }

    public LocalDate getUserDOB() {
        return userDOB;
    }

    public int getNumberOfUserPosts() {
        return numberOfUserPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sexOfUser=" + sexOfUser +
                ", userDOB=" + userDOB +
                ", numberOfUserPosts=" + numberOfUserPosts +
                '}';
    }
}
