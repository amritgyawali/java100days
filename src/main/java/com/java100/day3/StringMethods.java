package com.java100.day3;

public class StringMethods {
    public static void main(String[] args) {
        // Example String
        String str = "   Hello World!   ";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 6: " + str.charAt(6));

        // substring()
        System.out.println("Substring (index 3 to 8): " + str.substring(3, 8));

        // equals()
        String anotherStr = "Hello World!";
        System.out.println("Equals 'Hello World!': " + str.equals(anotherStr));

        // equalsIgnoreCase()
        String caseInsensitiveStr = "HELLO WORLD!";
        System.out.println("Equals ignoring case 'HELLO WORLD!': " + str.trim().equalsIgnoreCase(caseInsensitiveStr));

        // compareTo()
        String compareStr = "Hello Java!";
        System.out.println("Compare to 'Hello Java!': " + str.trim().compareTo(compareStr));

        // concat()
        System.out.println("Concatenated with ' Have a nice day!': " + str.trim().concat(" Have a nice day!"));

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // replace()
        System.out.println("Replace 'World' with 'Java': " + str.trim().replace("World", "Java"));

        // contains()
        System.out.println("Contains 'World': " + str.contains("World"));
    }
}

