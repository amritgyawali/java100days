package com.java100.day9;

import java.util.List;

public class NumberUtils {

    public static double sumOfNumber(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5);
        System.out.println("Sum of Integer:" + sumOfNumber(integerList));

        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println( "Sum of Double:" + sumOfNumber(doubleList));

        List<Number> mixedList = List.of(1.2,1,3L,4F,5.5);
        System.out.println("Mixed list: " + sumOfNumber(mixedList));
    }
}
