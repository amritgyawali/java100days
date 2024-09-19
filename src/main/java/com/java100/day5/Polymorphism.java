package com.java100.day5;

class Animal1 {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal1 myAnimal;

        myAnimal = new Dog1();
        myAnimal.makeSound(); // Dog barks

        myAnimal = new Cat1();
        myAnimal.makeSound(); // Cat meows
    }
}

