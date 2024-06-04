//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
package Labsecond;
//create a class
public class Rectangle {
    // Private instance variables for width and height
	 private double width;
	    private double height;
	    
	    // Constructor to initialize the Rectangle object
	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }
	    
	    // Method to calculate area  of the rectangle
	    public double calculateArea() {
	        return width * height;
	    }
	    
	    // Method to calculate perimeter of the rectangle
	    public double calculatePerimeter() {
	        return 2 * (width + height);
	    }
	    //create main method
	    public static void main(String[] args) {
	        // Creating a rectangle object with width 8.0 and height 4.0

	        Rectangle rectangle = new Rectangle(8.0, 4.0);
	        
	        // Calculating area and perimeter
	        double area = rectangle.calculateArea();
	        double perimeter = rectangle.calculatePerimeter();
	        
	        // Printing the results
	        System.out.println("Rectangle Area: " + area);
	        System.out.println("Rectangle Perimeter: " + perimeter);
	    }
	
}
/*Dry run
Rectangle Area: 32.0
Rectangle Perimeter: 24.0
/*
