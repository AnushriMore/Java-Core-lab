//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd
public class OddNumber {

    public static void main(String[] args) {
        // Test numbers
        int number1 = 10;  
        int number2 = 7;   

        try {
            // Check if number1 is even
            checkIfEven(number1);
            // If number1 is even, print a message indicating that
            System.out.println(number1 + " is even.");
        } catch (OddNumberException e) {
            // Catch and handle OddNumberException for number1
            System.out.println(e.getMessage());
        }

        try {
            // Check if number2 is even
            checkIfEven(number2);
            // If number2 is even, print a message indicating that
            System.out.println(number2 + " is even.");
        } catch (OddNumberException e) {
            // Catch and handle OddNumberException for number2
            System.out.println(e.getMessage());
        }
    }

    // Method to check if a number is even
    public static void checkIfEven(int number) throws OddNumberException {
        // If the number is not even, throw an OddNumberException
        if (number % 2 != 0) {
            throw new OddNumberException("The number is odd: " + number);
        }
    }

    // Custom Exception class for representing odd numbers
    static class OddNumberException extends Exception {
        // Constructor to create an OddNumberException with a custom message
        public OddNumberException(String message) {
            super(message);
        }
    }
}

/*Dry run
10 is even.
7 is odd: 7
/*
