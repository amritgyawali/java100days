package com.java100.day5;

/**
 * Modify the Vehicle and Car classes from the previous task to include constructors.
 * Use super to call the constructor of Vehicle from Car.
 * Override the move() method in Car and use super.move() within it.
 */

class Vehicle1{
    int speed;
    Vehicle1(int speed){
        this.speed = speed;
    }
    void move(){
        System.out.println("Vehicle is moving at " + speed + " km/h");
    }
}
class Car1 extends Vehicle1{
    Car1(int speed){
        super(speed);
    }

    @Override
    void move(){
        super.move();
        System.out.println("vehicle is moving from override at " + speed + " km");
    }
}
public class SuperClassTask {
    public static void main(String[] args) {
        Car1 car1 = new Car1(89);
        car1.move();
    }
}
