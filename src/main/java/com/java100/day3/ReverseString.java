package com.java100.day3;
//Write a Java program to reverse a string using a do-while loop.
public class ReverseString {
    public static void main(String[] args) {
        String word = "amritgyawali";

        StringBuilder rev = new StringBuilder();

        int i = word.length() - 1;
        do {
            rev.append(word.charAt(i));
            i--;
        } while (i >= 0);

        System.out.println("Reversed word: " + rev.toString());
    }
    }
