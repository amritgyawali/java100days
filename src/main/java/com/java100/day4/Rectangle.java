package com.java100.day4;

public class Rectangle {

    double length;
    double width;


    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 20;
        double area = rectangle.area();
        double perimeter = rectangle.perimeter();
        System.out.println(area + " " + perimeter + " ");
    }
}