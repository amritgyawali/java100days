package com.java100.day8;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 2);
        map.put("Ant", 3);

        System.out.println("Value for Apple: " + map.get("Apple"));

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
