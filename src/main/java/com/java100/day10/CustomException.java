package com.java100.day10;

/**
 * Create a custom exception InvalidEmailException that is thrown if an email address entered by the user
 * doesn't contain the @ symbol. Write a method validateEmail() that throws this exception.
 */

public class CustomException {
    public static void main(String[] args) {
        String email = "example.com";

        try {
            validateEmail(email);
            System.out.println("email is valid");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid email address. It should contain '@' symbol.");
        }
    }

    static class InvalidEmailException extends Exception {
        InvalidEmailException(String message) {
            super(message);
        }
    }
}
