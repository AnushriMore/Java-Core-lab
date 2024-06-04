//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape. In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.
package exercise;

// Abstract class representing a generic shape
abstract class Shape {
    // Abstract method to draw the shape
    public abstract void draw();
    
    // Abstract method to calculate the area of the shape
    public abstract double calculateArea();
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize Circle with given radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to draw the circle
    public void draw() {
        System.out.println("Drawing Circle");
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Cylinder class extending Circle
class Cylinder extends Circle {
    private double height;

    // Constructor to initialize Cylinder with given radius and height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Method to draw the cylinder
    public void draw() {
        System.out.println("Drawing Cylinder");
    }

    // Method to calculate the total surface area of the cylinder
    public double calculateArea() {
        // Total surface area of cylinder = 2 * area of circle (base) + circumference of circle (base) * height
        return 2 * super.calculateArea() + 2 * Math.PI * getRadius() * height;
    }

    // Helper method to get the radius of the cylinder
    private double getRadius() {
        return super.radius;
    }
}

// Main class containing the main method
public class inheritshape {
    public static void main(String[] args) {
        // Create instances of Circle and Cylinder
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(3, 6);

        // Draw the shapes
        circle.draw();
        cylinder.draw();

        // Print the area of the circle and the total surface area of the cylinder
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea());
    }
}

/*Dry run
Drawing Circle
Drawing Cylinder
Area of Circle: 78.53981633974483
Total Surface Area of Cylinder: 150.79644737231007
/*
