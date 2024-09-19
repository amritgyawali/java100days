package com.java100.day5;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // Call the constructor of Animal
    }

    @Override
    void eat() {
        super.eat(); // Call the superclass method
        System.out.println(name + " is eating dog food");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat(); // Buddy is eating dog food
    }
}
