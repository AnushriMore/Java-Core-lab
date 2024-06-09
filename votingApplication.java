//Write a program for voting Application, take the user’s age as input and explicitly throw the exception if the user’s age is less than 18 to terminate the program.
import java.util.Scanner;

public class VotingApplication {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Voting Application!");
        
        // Prompt the user to enter their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt(); // Read user input as integer

        try {
            // Check eligibility based on the provided age
            checkEligibility(age);
            // If the user is eligible, print a congratulatory message
            System.out.println("Congratulations! You are eligible to vote.");
            
        } catch (AgeBelowThresholdException e) {
            // If the user is not eligible, catch the AgeBelowThresholdException and print the error message
            System.out.println(e.getMessage());
            // Terminate the program after displaying the error message
            System.out.println("Terminating the program.");
        } finally {
            // Close the Scanner to prevent resource leaks
            scanner.close(); 
        }
    }

    // Method to check the eligibility for voting
    public static void checkEligibility(int age) throws AgeBelowThresholdException {
        // If the age is below 18, throw an AgeBelowThresholdException
        if (age < 18) {
            throw new AgeBelowThresholdException("Sorry, you must be at least 18 years old to vote.");
        }
    }

    // Custom exception class to represent age below the voting threshold
    static class AgeBelowThresholdException extends Exception {
        // Constructor to create an AgeBelowThresholdException with a custom message
        public AgeBelowThresholdException(String message) {
            super(message);
        }
    }
}
/*Dry run
Welcome to the Voting Application!
Please enter your age: 20
Congratulations! You are eligible to vote.

If the user enters an age below 18, the program will catch the AgeBelowThresholdException and print the corresponding error message.
Welcome to the Voting Application!
Please enter your age: 16
Sorry, you must be at least 18 years old to vote.
/*
