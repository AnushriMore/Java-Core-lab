//Write a Java program to get a number from the user and print whether it is positive or negative.
package demo; // Define the package name

import java.util.Scanner; // Import the Scanner class for user input

// Create a class named positivenegative
public class positivenegative {
    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Input number: ");
        int input = sc.nextInt(); // Read the input number

        // Use conditional statements to determine the nature of the number
        if (input > 0) {
            System.out.println("Number is positive"); // If input is greater than 0, print "Number is positive"
        } else if (input < 0) {
            System.out.println("Number is negative"); // If input is less than 0, print "Number is negative"
        } else {
            System.out.println("Number is zero"); // If input is 0, print "Number is zero"
        }
    }
}

/*Dry run
Input number: 5
Number is positive

Input number: -3
Number is negative

Input number: 0
Number is zero
/*
