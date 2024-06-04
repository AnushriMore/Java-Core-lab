//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
package Labsecond;
// create a class
public class Employee {
	 private String name;
	    private String jobTitle;
	    private double salary;
	    
	    // create Constructor to initialize the Employee object
	    public Employee(String name, String jobTitle, double salary) {
	        this.name = name;
	        this.jobTitle = jobTitle;
	        this.salary = salary;
	    }
	    
	    //create a Getter method for name
	    public String getName() {
	        return name;
	    }
	    
	    // create a Getter method for job title
	    public String getJobTitle() {
	        return jobTitle;
	    }
	    
	    // create a Getter method for salary
	    public double getSalary() {
	        return salary;
	    }
	    
	    // Method to calculate annual salary
	    public double calculateAnnualSalary() {
	        return salary * 12;
	    }
	    
	    // Method to update salary
	    public void updateSalary(double newSalary) {
	        this.salary = newSalary;
	        System.out.println("Salary updated for " + name + " (" + jobTitle + ") to $" + salary);
	    }
	    
	    public static void main(String[] args) {
	        // Creating an employee object
	        Employee employee = new Employee("Anushri More", "Software Engineer", 80000.0);
	        
	        // Displaying employee information
	        System.out.println("Employee Name: " + employee.getName());
	        System.out.println("Job Title: " + employee.getJobTitle());
	        System.out.println("Salary: $" + employee.getSalary());
	        
	        // Calculating and displaying annual salary
	        System.out.println("Annual Salary: $" + employee.calculateAnnualSalary());
	        
	        // Updating employee salary
	        employee.updateSalary(85000.0);
	    }
	}
/*Dry run
Employee Name: Anushri More
Job Title: Software Engineer
Salary: $80000.0
Annual Salary: $960000.0
Salary updated for Anushri More (Software Engineer) to $85000.0
/*
