package com.java100.day6;

abstract class Animal2 {
    String name;
    Animal2(String name) {
        this.name = name;
    }

    //abstract method
    abstract void makeSound();

    //concrete method
    void sleep(){
        System.out.println(name + " is sleeping");
    }
}

class Dog2 extends Animal2 {
    Dog2(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }}


public class Abstract {
    public static void main(String[] args) {
        Dog2 dog = new Dog2("Buddy");
        dog.makeSound();
        dog.sleep();
    }
}
