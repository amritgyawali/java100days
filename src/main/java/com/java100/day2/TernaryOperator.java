package com.java100.day2;
//Write a program to check if a number is even or odd using the ternary operator.
public class TernaryOperator {
    public static void main(String[] args) {

        int a = 6;
        int b = 5;
        String oddEven = (b%2)==0?"even":"odd";
        System.out.println(oddEven);
    }
}
