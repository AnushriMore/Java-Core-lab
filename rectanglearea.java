//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
package exercise; // Define the package name

// Define a base class named Shape
class Shape 
{
// Method to get the area of the shape, returns 0 by default
    public double getArea()
    {
        return 0; 
    }
}

// Define a subclass named Rectangle that extends the Shape class
class Rectangle extends Shape 
{
// Private member variables to store the dimensions of the rectangle
    private double length;
    private double width;

// Constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

// Overriding getArea method to calculate the area of the rectangle
    @Override
    public double getArea() 
    {
        return length * width;
    }
}

// Define the main class with the main method
public class aayat  
{
// Main method: Entry point of the program
    public static void main(String[] args) 
    {
// Creating an instance of Rectangle with length 4 and width 6
        Rectangle rectangle = new Rectangle(4, 6);
        
// Printing the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}

/*Dry Run
Area of the rectangle: 24.0
/*
