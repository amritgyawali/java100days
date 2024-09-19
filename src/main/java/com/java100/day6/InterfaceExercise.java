package com.java100.day6;

interface Movable{
    void start();
    void stop();
}

class Car implements Movable{
    @Override
    public void start() {
        System.out.println("Car started");
    }
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
class Bicycle implements Movable{
    @Override
    public void start(){
        System.out.println("Bicycle started");
    }
    @Override
    public void stop(){
        System.out.println("Bicycle stopped");
    }
}
public class InterfaceExercise {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        Bicycle bicycle = new Bicycle();
        bicycle.start();
        bicycle.stop();

    }

}
