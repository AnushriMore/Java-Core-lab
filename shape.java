//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.
//class Shape
abstract class Shape {
// Abstract methods to calculate area and perimeter
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

   // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

// Implementing abstract methods for calculating area and perimeter
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

// Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementing abstract methods for calculating area and perimeter
    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main class to test the program
public class Labno5_4 {
    public static void main(String[] args) {
        double r = 4.0;
        Circle circle = new Circle(r);
        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
        Triangle triangle = new Triangle(ts1, ts2, ts3);

// Displaying information about Circle
        System.out.println("Radius of the Circle: " + r);
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());

// Displaying information about Triangle
        System.out.println("\nSides of the Triangle are: " + ts1 + ", " + ts2 + ", " + ts3);
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }
}
/*Dry run
Radius of the Circle: 4.0
Area of the Circle: 50.26548245743669
Perimeter of the Circle: 25.132741228718345

Sides of the Triangle are: 3.0, 4.0, 5.0
Area of the Triangle: 6.0
Perimeter of the Triangle: 12.0
/*
