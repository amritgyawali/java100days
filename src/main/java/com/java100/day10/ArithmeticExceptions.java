package com.java100.day10;

import java.util.Scanner;

/**
 * Write a program that prompts the user to input two numbers and divides them.
 * Handle cases where the second number is zero using ArithmeticException.
 */
public class ArithmeticExceptions {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        try {
            double result = (double) num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }

}
