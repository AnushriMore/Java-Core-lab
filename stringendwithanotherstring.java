//Write a Java program to check whether a given string ends with another string.
public class Labno7_6pro {
	// Define a public class named Labno7_6pro .
	
	    // Define the main method.
	    public static void main(String[] args) {
	        // Declare and initialize two string variables, str1 and str2.
	        String str1 = "Python Exercises";
	        String str2 = "Python Exercise";

	        // The String to check the above two Strings to see
	        // if they end with this value (se).
	        String end_str = "se";

	        // Check if the first string ends with end_str.
	        boolean ends1 = str1.endsWith(end_str);
	        
	        // Check if the second string ends with end_str.
	        boolean ends2 = str2.endsWith(end_str);

	        // Display the results of the endsWith calls.
	        System.out.println("\"" + str1 + "\" ends with " +
	            "\"" + end_str + "\"? " + ends1);
	        System.out.println("\"" + str2 + "\" ends with " +
	            "\"" + end_str + "\"? " + ends2);
	    }
	}
	
/*Dry run
"Python Exercises" ends with "se"? true
"Python Exercise" ends with "se"? false
/*

