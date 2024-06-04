//Write a Java program to concatenate a given string to the end of another string.
public class Labno7_2pro {
	  // Define a public class named Labno7_2pro  .
	  // Define the main method.
	    public static void main(String[] args) {
	        // Declare and initialize two string variables, str1 and str2.
	        String str1 = "PHP Exercises and ";
	        String str2 = "Python Exercises";
	        
	        // Print the first string.
	        System.out.println("String 1: " + str1);
	        // Print the second string.
	        System.out.println("String 2: " + str2); 
	       
	        // Concatenate the two strings together and store the result in str3.
	        String str3 = str1.concat(str2);

	        // Display the newly concatenated string.
	        System.out.println("The concatenated string: " + str3);
	    }
	}

/*Dry run
String 1: PHP Exercises and 
String 2: Python Exercises
The concatenated string: PHP Exercises and Python Exercises
/*

