package com.java100.day1;
//Write a program to demonstrate implicit and explicit type casting.
public class TypeCasting {


    public static void main(String[] args) {
        short a = 2;
        int b = 40;
        long c = 1000;
        float d = 50.6f;

        int e = (int) c;
        int f = (int) d;
        char g = (char) b;
        byte h = (byte) c;
        int i = a;

        System.out.println(" long to int: "+e);
        System.out.println(" float to int: "+f);
        System.out.println(" int to char: "+g);
        System.out.println(" long to byte: "+h);
        System.out.println(" byte to int: "+h);


    }

}
