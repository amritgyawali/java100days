package com.java100.day5;

class Vehicle2 {
    void move(){
        System.out.println("vehicel is moving");
    }
}
class Car2 extends Vehicle2{
    void move(){
        System.out.println("Car is moving");
    }
}
class Truck extends Vehicle2{
    @Override
    void move() {
        System.out.println("truck is moving");
    }
}
public class PolymorphismExcersise {
    public static void main(String[] args) {
        Vehicle2[] vehicle = new Vehicle2[2];
        vehicle[0] = new Car2();
        vehicle[1] = new Truck();
        for(Vehicle2 v : vehicle){
            v.move();
        }
    }
}
