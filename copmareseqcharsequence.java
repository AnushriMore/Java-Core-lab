//Write a Java program to compare a given string to the specified character sequence.
public class Labno7_4pro {
	// Define a public class named Labno7_4pro  .
	// Define the main method.
	    public static void main(String[] args) {
	        // Declare and initialize two string variables, str1 and str2.
	        String str1 = "example.com", str2 = "Example.com";
	        
	        // Create a CharSequence object named cs with value "example.com".
	        CharSequence cs = "example.com";
	        
	        // Compare str1 and cs for content equality and print the result.
	        System.out.println("Comparing " + str1 + " and " + cs + ": " + str1.contentEquals(cs));
	        
	        // Compare str2 and cs for content equality and print the result.
	        System.out.println("Comparing " + str2 + " and " + cs + ": " + str2.contentEquals(cs));
	    }
	}
/*Dry run
Comparing example.com and example.com: true
Comparing Example.com and example.com: false
/*
