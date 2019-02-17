package com.kodilla.good.patterns.challenges.order.service;

public class User {
    private final String firstName;
    private final String lastName;
    private final String mail;
    private final String userStatus;

    public User(String firstName, String lastName, String mail, String userStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.userStatus = userStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
