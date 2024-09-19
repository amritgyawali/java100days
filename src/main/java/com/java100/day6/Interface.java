package com.java100.day6;

interface Animal{
    void makeSound();

    default void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}
