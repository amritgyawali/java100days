package com.java100.day1;
//Write a program that uses relational, logical, and assignment operators to compare two numbers.
public class Compare2num {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        if (a>b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }
        System.out.println((a>b) && b<a);
        System.out.println((b<a));
    }
}
