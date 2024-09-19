package com.java100.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Create a List of integers and add 5 elements to it. Iterate over the list and print each element.
 * Create a Set of strings and add 5 unique elements to it. Attempt to add a duplicate element and observe the behavior.
 * Create a Map with string keys and integer values. Add 3 key-value pairs to it and retrieve a value by its key.
 */
public class Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("apple");
        list.add("apple");
        list.add("apple");
        System.out.println("list"+list);

        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("apple");
        set.add("banana");
        set.add("mango");
        set.add("watermelon");
        set.add("peach");
        System.out.println("set"+set);

        HashMap<String,Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
            map.put("mango", 3);
        map.put("watermelon", 4);
        map.put("apple",5);
        System.out.println("map"+map);
    }
}
