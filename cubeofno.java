package demo; // Define the package name

import java.util.Scanner; // Import the Scanner class for user input

// Create a class named cubeofno 
public class cubeofno {
    // Main method: Entry point of the program
    public static void main(String[] args) {
        int i, n; // Declare variables: i for loop control, n for the number of terms

        // Prompt the user to input the number of terms
        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in); // Create a Scanner object to read input
        n = in.nextInt(); // Read the input number

        // Use a for loop to iterate from 1 to the input number n
        for (i = 1; i <= n; i++) {
            // Print the number and its cube
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i * i * i));
        }
    }
}
/*Dry run
Input number of terms : 5
Number is : 1 and cube of 1 is : 1
Number is : 2 and cube of 2 is : 8
Number is : 3 and cube of 3 is : 27
Number is : 4 and cube of 4 is : 64
Number is : 5 and cube of 5 is : 125
/*
