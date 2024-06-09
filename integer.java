//Integer Number
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputExample {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter an integer
            System.out.print("Please enter an integer: ");
            // Read the integer input from the user
            int userInput = scanner.nextInt();
            // Print the entered integer
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            // Catch InputMismatchException if the input provided by the user is not an integer
            System.out.println("InputMismatchException caught! Please enter a valid integer.");
            
            // Consume the invalid input to avoid an infinite loop
            scanner.nextLine();
        } finally {
            // Close the Scanner to prevent resource leaks
            scanner.close(); 
        }
    }
}
/*Dry run
If the user enters a non-integer input (e.g., a string or a floating-point number):
Please enter an integer: abc
InputMismatchException caught! Please enter a valid integer.

If the user enters a floating-point number:
Please enter an integer: 3.14
InputMismatchException caught! Please enter a valid integer.
/*
