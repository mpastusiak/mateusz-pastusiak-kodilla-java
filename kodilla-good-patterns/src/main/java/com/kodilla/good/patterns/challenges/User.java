package com.kodilla.good.patterns.challenges;

public class User {
    private String firstName;
    private String lastName;
    private String mail;
    private String userStatus;

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
