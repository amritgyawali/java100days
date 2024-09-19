package com.java100.day9;

import java.util.ArrayList;
import java.util.List;

public class ListCopyExample {
    public static <T> void copyList(List<? extends T> source,List<? super T> destination){
        for (T item : source){
            destination.add(item);
        }
    }
    public static void main(String[] args) {
        List<Integer> sourceList = List.of(1,2,3);
        List<Number> destinationList = new ArrayList<>();
        copyList(sourceList, destinationList);
        System.out.println("destinationList : "+destinationList); // Output: [1, 2, 3]
    }
}
