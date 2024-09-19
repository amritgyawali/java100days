package com.java100.day8;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two sets to store integers
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Read the first set of integers from the user
        System.out.println("Enter integers for the first set (type '0' to stop): ");
        int number;
        do {
            number = scanner.nextInt();
            if (number != 0) {
                set1.add(number);
            }
        } while (number != 0);

        // Read the second set of integers from the user
        System.out.println("Enter integers for the second set (type '0' to stop): ");
        do {
            number = scanner.nextInt();
            if (number != 0) {
                set2.add(number);
            }
        } while (number != 0);

        // Perform union operation
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union of the sets: " + unionSet);

        // Perform intersection operation
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection of the sets: " + intersectionSet);

        // Perform difference operation (set1 - set2)
        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + differenceSet);

        scanner.close();
    }
}
