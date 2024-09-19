package com.java100.day9;

import java.util.Arrays;

public class SimpleGenericSwap {

    // Basic generic swap method
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Test with Integer array
        Integer[] intArray = {1, 2, 3, 4};
        swap(intArray, 0, 2);
        System.out.println(Arrays.toString(intArray));

        // Test with String array
        String[] strArray = {"A", "B", "C", "D"};
        swap(strArray, 1, 3);
        System.out.println(Arrays.toString(strArray));

        // Test with Double array
        Double[] dblArray = {1.1, 2.2, 3.3, 4.4};
        swap(dblArray, 0, 1);
        System.out.println(Arrays.toString(dblArray));
    }
}
