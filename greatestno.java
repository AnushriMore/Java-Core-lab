//Write a Java program that takes three numbers from the user and prints the greatest number.
package demo; // Define the package name
 
import java.util.Scanner; // Import the Scanner class for user input

// Create a class named greatestno
public class greatestno {
    // Main method: Entry point of the program
    public static void main(String[] args) {
// Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

// Prompt the user to input the 1st number
        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt(); // Read the first number

// Prompt the user to input the 2nd number
        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt(); // Read the second number

 // Prompt the user to input the 3rd number
        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt(); // Read the third number

 // Check if the 1st number is greater than the 2nd number
        if (num1 > num2) {
 // If true, check if the 1st number is also greater than the 3rd number
            if (num1 > num3) {
 // If true, print that the 1st number is the greatest
                System.out.println("The greatest: " + num1);
            }
        }

// Check if the 2nd number is greater than the 1st number
        if (num2 > num1) {
// If true, check if the 2nd number is also greater than the 3rd number
            if (num2 > num3) {
// If true, print that the 2nd number is the greatest
                System.out.println("The greatest: " + num2);
            }
        }

// Check if the 3rd number is greater than the 1st number
        if (num3 > num1) {
// If true, check if the 3rd number is also greater than the 2nd number
            if (num3 > num2) {
// If true, print that the 3rd number is the greatest
                System.out.println("The greatest: " + num3);
            }
        }
    }
}
/*Dry run
Input the 1st number: 5
Input the 2nd number: 9
Input the 3rd number: 3
The greatest: 9
/*
/*Dry run
Input the 1st number: 10
Input the 2nd number: 10
Input the 3rd number: 5
The greatest: 10
/*
/*Dry run
Input the 1st number: 7
Input the 2nd number: 4
Input the 3rd number: 7
The greatest: 7
/*
