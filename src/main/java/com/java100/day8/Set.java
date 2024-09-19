package com.java100.day8;

import java.util.HashSet;
import java.util.TreeSet;

//Create a TreeSet of integers and add 5 elements to it. Observe how the elements are sorted automatically.
public class Set {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Cherry");
        set.add("Berry");
        set.add("Azir");

        if (set.contains("Banana")) {
            System.out.println("Set contains Banana");
        }

        System.out.println(set);
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
