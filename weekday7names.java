//Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
package demo;
import java.util.Scanner;
//create class
public class weekday7names { 
    
//create main method
 public static void main(String[] args)
    {
// Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
// Read an integer input from the user
        int day = in.nextInt();
// Call the getDayName method with the user input and print the result
        System.out.println(getDayName(day));
    }

   // Method to get the name of the day for a given number (1 to 7)
    public static String getDayName(int day) {
        String dayName = "";
   // Use a switch statement to map numbers to day names
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }

        return dayName;// Return the day name
    }
}
/*Dry run
Input number: 3
Wednesday

Input number: 7
Sunday

Input number: 10
Invalid day range
/*s

