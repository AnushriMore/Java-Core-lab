//Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels
public class VowelChecker {

    public static void main(String[] args) {
        // Test strings
        String testString1 = "Hello";  
        String testString2 = "Fly";   

        try {
            // Check if testString1 contains vowels
            checkForVowels(testString1);
            System.out.println(testString1 + " contains vowels.");
        } catch (NoVowelsException e) {
            // Catch and handle NoVowelsException for testString1
            System.out.println(e.getMessage());
        }

        try {
            // Check if testString2 contains vowels
            checkForVowels(testString2);
            System.out.println(testString2 + " contains vowels.");
        } catch (NoVowelsException e) {
            // Catch and handle NoVowelsException for testString2
            System.out.println(e.getMessage());
        }
    }

    // Method to check if a string contains vowels
    public static void checkForVowels(String str) throws NoVowelsException {
        // If the string doesn't contain vowels, throw NoVowelsException
        if (!containsVowels(str)) {
            throw new NoVowelsException("The string does not contain any vowels.");
        }
    }

    // Method to check if a string contains vowels
    public static boolean containsVowels(String str) {
        // Define vowels
        String vowels = "aeiouAEIOU";
        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a vowel
            if (vowels.indexOf(c) != -1) {
                return true; // If a vowel is found, return true
            }
        }
        return false; // If no vowels are found, return false
    }

    // Custom exception class for when no vowels are found in a string
    static class NoVowelsException extends Exception {
        // Constructor to create a NoVowelsException with a custom message
        public NoVowelsException(String message) {
            super(message);
        }
    }
}

/*Dry run
Hello contains vowels.
NoVowelsException: The string does not contain any vowels.
/*
