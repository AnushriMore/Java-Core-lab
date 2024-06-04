//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.

package exercise;
// Abstract class representing a shape
abstract class Shape {
    // Abstract methods to be implemented by subclasses
    public abstract void draw();
    public abstract double calculateArea();
}

// Subclass representing a circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method for drawing
    public void draw() {
        System.out.println("Drawing Circle");
    }

    // Implementation of abstract method for calculating area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass representing a square
class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Implementation of abstract method for drawing
    public void draw() {
        System.out.println("Drawing Square");
    }

    // Implementation of abstract method for calculating area
    public double calculateArea() {
        return side * side;
    }
}

// Subclass representing a triangle
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of abstract method for drawing
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    // Implementation of abstract method for calculating area
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to test the shapes
public class areas3 {
    public static void main(String[] args) {
        // Creating instances of shapes
        Circle circle = new Circle(4);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 5);

        // Drawing shapes and calculating their areas
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
/*Dry run
Drawing Circle
Area of Circle: 50.26548245743669
Drawing Square
Area of Square: 16.0
Drawing Triangle
Area of Triangle: 7.5
/*
