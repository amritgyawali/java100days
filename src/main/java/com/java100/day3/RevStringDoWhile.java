package com.java100.day3;

public class RevStringDoWhile {
    public static void main(String[] args) {
        String a = "Hello AMriT";
        a = a.toLowerCase();

        int length = a.length();
        StringBuilder sb = new StringBuilder();
        int i = length - 1;

        // Use do-while loop to reverse the string
        do {
            sb.append(a.charAt(i));
            i--;
        } while (i >= 0); // Continue as long as index is non-negative

        // Print the reversed string
        System.out.println(sb.toString());
    }
}
