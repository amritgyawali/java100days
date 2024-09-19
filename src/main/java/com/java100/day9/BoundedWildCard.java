package com.java100.day9;

import java.util.List;

public class BoundedWildCard {

    public static <T extends Comparable<T>> int countGreaterThan(List<? extends T> list,T threshold) {
        int count = 0;
        for (T element : list) {
            if (element.compareTo(threshold) > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> numberList = List.of(1,3,5,7,9);
        int threshold = 4;
        int count = countGreaterThan(numberList,threshold);
        System.out.println("Count of elements greater than" + threshold + ": " + count);


    }
}
