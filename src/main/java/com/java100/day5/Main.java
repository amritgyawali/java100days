package com.java100.day5;

/**
 * Create a superclass Vehicle with properties like speed and a method move().
 * Create a subclass Car that inherits from Vehicle and adds a method honk().
 * Instantiate Car in your main() method, set its properties, and call both move() and honk().
 */

class Vehicle{
    int speed;
    void move(){
        System.out.println("car is moving in speed of : "+ speed);
    }
}

class Car extends Vehicle{
    void honk(){
        System.out.println("car is honking in the speed of "+ speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 99;
        car.move();
        car.honk();

    }
}
