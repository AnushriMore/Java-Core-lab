//Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.
// Define the Employee class
class Employee {
    // Method to calculate salary, returns 0 as a default value
    public double calculateSalary() {
        return 0.0;  
    }
} 

// Define the Manager class, extending Employee
class Manager extends Employee {
    // Override the calculateSalary method for managers, returning a fixed salary
    @Override
    public double calculateSalary() {
        return 70000.0;  
    }
}

// Define the Programmer class, extending Employee
class Programmer extends Employee {
    // Override the calculateSalary method for programmers, returning a fixed salary
    @Override
    public double calculateSalary() {
        return 50000.0;  
    }
}

// Main class to demonstrate the program
public class empsalary {
    public static void main(String[] args) {
     // Create instances of Manager and Programmer classes
        Manager manager = new Manager();
        Programmer programmer = new Programmer();
        
    // Print the salaries of the manager and programmer
        System.out.println("Manager's salary: " + manager.calculateSalary());
        System.out.println("Programmer's salary: " + programmer.calculateSalary());
    }
}

/*Dry run
Manager's salary: 70000.0
Programmer's salary: 50000.0
/*
