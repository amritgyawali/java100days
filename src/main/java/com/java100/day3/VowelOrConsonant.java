package com.java100.day3;
//Write a Java program to check if a character is a vowel or consonant using a switch statement.
public class VowelOrConsonant {
    public static void main(String[] args) {
        Character ch = 'u';
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("it is vowel chatacter");

            default:
                System.out.println("entered value is consonant");
        }
    }
}
