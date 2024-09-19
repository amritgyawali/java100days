package com.java100.day9;

import java.util.List;

public class WildCard {
    public static void printList(List<?> list){
        for(Object elem:list){
            System.out.println(elem+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4);
        List<String> stringList = List.of("A", "B", "C", "D");

        printList(integerList);
        printList(stringList);
    }
}
