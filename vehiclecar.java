//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".
package exercise; // Define the package name

// Define a base class named Vehicle
class Vehicle 
{
    // Method to print a message indicating that a vehicle is being driven
    public void drive()
    {
        System.out.println("Driving a vehicle");
    }
}

// Define a subclass named Car that extends the Vehicle class
class Car extends Vehicle
{
    // Override the drive method to print a message indicating that a car is being repaired
    @Override
    public void drive() 
    {
        System.out.println("Repairing a car");
    }
}

// Define the main class with the main method
public class Main 
{
// Main method: Entry point of the program
    public static void main(String[] args)
    {
// Creating an instance of the Car class
        Car myCar = new Car();
        
// Calling the drive method of the Car instance
        myCar.drive();
    }
}
/*Dry run
Repairing a car
/*
