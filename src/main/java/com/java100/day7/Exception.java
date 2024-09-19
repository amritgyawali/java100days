package com.java100.day7;

/**
 * Create a simple program that attempts to divide two numbers,
 * catching and handling the ArithmeticException when division by zero is attempted.
 * Modify the program to catch multiple exceptions,
 * such as NullPointerException and ArrayIndexOutOfBoundsException.
 */

public class Exception extends Throwable {
    public Exception(String message) {
    }

    public static void main(String[] args) {
        int num = 5;
        String a;
        try {
            int div = num/0;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException..."+e);
        }
        try {
            int[] arr = {1, 2, 3};
            int index = 5;
            System.out.println(arr[index]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        try {
            a = null;
            System.out.println(a.length());
        }catch (NullPointerException e){
            System.out.println(e);
        }

    }
}
