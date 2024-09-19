package com.java100.day9;

public class GenericFilterMax {

    public  static <T extends Comparable<T>>T findMax(T[] array){
        if (array == null || array.length==0){
            return null;
        }

        T max = array[0];
        for (T element:array){
            if (element.compareTo(max)>0){
                max=element;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        Integer[] intArray ={1,5,3,9,2};
        System.out.println("Max Integer "+findMax(intArray));

        String[] strArray ={"apple", "orange", "zbananas", };
        System.out.println("Max String "+findMax(strArray));

        Double[] doubleArray ={1.5, 5.5, 3.5, 9.5, 2.5};
        System.out.println("Max Double "+findMax(doubleArray));

    }
}
