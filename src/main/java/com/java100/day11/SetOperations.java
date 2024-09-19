package com.java100.day11;

import java.util.HashSet;

public class SetOperations {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");

        HashSet<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("dates");
        set2.add("apple");

        HashSet<String> intersectionSet = findIntersection(set1,set2);
        System.out.println("Intersectioon: "+ intersectionSet);
    }

    private static HashSet<String> findIntersection(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
