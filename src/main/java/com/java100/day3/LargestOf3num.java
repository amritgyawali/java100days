package com.java100.day3;
//Write a Java program to find the largest of three numbers using if-else statements.
public class LargestOf3num {
    public static void main(String[] args) {
        int a = 7;
        int b =6;
        int c = 3;

        if(a>b && b>c){
            System.out.println("a is greater");
        } else if (b>a && b>c) {
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }
    }
}
