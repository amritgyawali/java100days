package com.java100.day6;

/**
 * Create an abstract class Shape with an abstract method draw().
 * Create two subclasses Circle and Square, each implementing the draw() method.
 * In the main() method, instantiate Circle and Square, and call the draw() method on both.
 */
abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing circle");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Square");
    }
}
public class AbstractExcersise {
    public static void main(String[] args) {
        Square square = new Square();
        square.draw();
        Circle circle = new Circle();
        circle.draw();
    }

}
