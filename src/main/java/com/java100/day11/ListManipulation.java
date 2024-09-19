package com.java100.day11;

import java.util.ArrayList;
import java.util.List;

//Create a method that merges two ArrayLists and returns the merged list. Remove duplicates from the merged list.

public class ListManipulation {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Cherry");
        list2.add("Grape");

        List<String> mergedList = mergeLists(list1,list2);

        System.out.println(mergedList);
    }

    private static List<String> mergeLists(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> mergedList = new ArrayList<>(list1);

        for(String item : list2){
            if(!mergedList.contains(item)){
                mergedList.add(item);
            }
        }
        return mergedList;
    }
}
