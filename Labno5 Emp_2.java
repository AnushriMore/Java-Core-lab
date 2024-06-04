//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.

// Define an abstract class named Employee
abstract class Employee {
    private String name;
    private int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateSalary(); // Calculate salary based on specific criteria
    public abstract void displayInfo(); // Display employee information

    // Getters for name and employeeId
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

// Subclass Manager extending Employee
class Managr extends Employee {
    private double baseSalary;
    private double bonus;

    // Constructor
    public Managr(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementing abstract methods
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + calculateSalary());
    }
}

// Subclass Programmer extending Employee
class Program extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public Program(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

// Implementing abstract methods
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer Information:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: " + calculateSalary());
    }
}

// Main class to test the program
public class Labno5_2 {
    public static void main(String[] args) {
        
// Create instances of Manager and Programmer
        Managr manager = new Managr("Abc", 1001, 5000.0, 1500.0);
        Program programmer = new Program("Xyz", 2001, 30.0, 160);

// Display information for Manager and Programmer
        manager.displayInfo();
        System.out.println(); // Add a line break for clarity
        programmer.displayInfo();
    }
}

/*Dry run
Manager Information:
Name: Abc
Employee ID: 1001
Salary: 6500.0

Programmer Information:
Name: Xyz
Employee ID: 2001
Salary: 4800.0
/*
