package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[ ]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            System.out.println(secondChallenge.probablyIWillThrowException(3.0, 1.2));

        } catch (Exception e) {

            System.out.println("Unexpected value!");

        } finally {

            System.out.println("Application Shutdown!");

        }

    }
}
