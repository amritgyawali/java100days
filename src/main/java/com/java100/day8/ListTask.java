package com.java100.day8;

import java.util.LinkedList;

public class ListTask {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Task 1");
        list.add("Task 2");
        list.add("Task 3");
        list.add("Task 4");
        list.add("Task 5");
        list.remove("Task 1");
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("all list: " + list);
    }
}
