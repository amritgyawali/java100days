package com.java100.day10;


/**
 * Write a program that takes an integer and a string from the user.
 * First, check if the string is a valid integer using NumberFormatException.
 * Then, check if the integer is within a certain range (throw an exception if it's not).
 */

public class NumberFormatExceptions {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(getUserInput("Enter an integer: "));
            checkRange(number);
            System.out.println("The entered integer is within the range.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkRange(int number) {
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("The entered integer is not within the range (1-100).");
        }
    }

    private static String getUserInput(String s) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(s);
        return scanner.nextLine();
    }
}
