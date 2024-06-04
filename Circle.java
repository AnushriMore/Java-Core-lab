//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.
package Labsecond;
//create a class 
public class Circle {
	 private double radius;
	    
	    // create a Constructor
	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    
	    // create Getter method for radius
	    public double getRadius() {
	        return radius;
	    }
	    
	    // create Setter method for radius
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }
	    
	    // Method to calculate area
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }
	    
	    // Method to calculate circumference
	    public double calculateCircumference() {
	        return 2 * Math.PI * radius;
	    }
	        //main method
	    public static void main(String[] args) {
	        // Creating a circle object with radius 5.0
	        Circle circle = new  Circle(5.0);
	        
	        // Calculating area and circumference
	        double area = circle.calculateArea();
	        double circumference = circle.calculateCircumference();
	        
	        // Printing the results
	        System.out.println("Circle Area: " + area);
	        System.out.println("Circle Circumference: " + circumference);
	        
	        // Modifying the radius of the circle
	        circle.setRadius(7.0);
	        
	        // Recalculating area and circumference after modifying radius
	        area = circle.calculateArea();
	        circumference = circle.calculateCircumference();
	        
	        // Printing the updated results
	        System.out.println("\nUpdated Circle Area: " + area);
	        System.out.println("Updated Circle Circumference: " + circumference);
	    }
	}
/*Dry run
Circle Area: 78.53981633974483
Circle Circumference: 31.41592653589793

Updated Circle Area: 153.93804002589985
Updated Circle Circumference: 43.982297150257104
/*
	
