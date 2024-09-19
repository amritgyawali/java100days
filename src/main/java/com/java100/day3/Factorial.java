package com.java100.day3;
//Write a Java program to calculate the factorial of a number using a while loop.
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact =1;
        while (num>1){

            fact = fact*num;
            num--;
        }
        System.out.println(fact);
    }
}
