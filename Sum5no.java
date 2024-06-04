//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
package demo; // Define the package name

import java.util.Scanner; // Import the Scanner class for user input

// Create a class named sum5no
public class sum5no { 
    // Main method: Entry point of the program
    public static void main(String[] args) {
        int i, n = 0, s = 0; // Declare variables: i for loop control, n for input number, s for sum
        double avg; // Declare a variable to store the average

        // Block to prompt the user for input
        {
            System.out.println("Input the 5 numbers : "); // Prompt the user to input 5 numbers
        }

        // For loop to read 5 numbers from the user
        for (i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in); // Create a Scanner object to read input
            n = in.nextInt(); // Read the next integer input by the user

            s += n; // Add the input number to the sum
        }

        avg = s / 5.0; // Calculate the average (note the use of 5.0 to ensure floating-point division)

        // Print the sum and average of the 5 numbers
        System.out.println("The sum of 5 numbers is : " + s + "\nThe Average is : " + avg);
    }
}
/*Dry run
Input the 5 numbers : 
1
2
3
4
5
The sum of 5 numbers is : 15
The Average is : 3.0
/*
