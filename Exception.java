//Write a Java program that throws an exception and catch it using a try-catch block.
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
            // Attempt to execute the divideByZero method
            divideByZero();
        } catch (DivideByZeroException e) {
            // Catch and handle DivideByZeroException
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    // Method that may throw a DivideByZeroException
    public static void divideByZero() throws DivideByZeroException {
        // Define numerator and denominator
        int numerator = 10;
        int denominator = 0;

        // Check if denominator is zero
        if (denominator == 0) {
            // Throw a DivideByZeroException if the denominator is zero
            throw new DivideByZeroException("Division by zero is not allowed.");
        }

        // Perform division
        int result = numerator / denominator;
        // Print the result if division is successful
        System.out.println("Result: " + result);
    }

    // Custom Exception class for division by zero
    static class DivideByZeroException extends Exception {
        // Constructor to create a DivideByZeroException with a custom message
        public DivideByZeroException(String message) {
            super(message);
        }
    }
}
/*Dry run
Caught Exception: Division by zero is not allowed.
/*
