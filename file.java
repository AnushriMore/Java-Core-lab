//Write a Java program to create a method that reads a file and throws an exception if the file is not found.
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        // File to be read
        String filename = "sample.txt";

        try {
            // Attempt to read the file and store its content
            String content = readFile(filename);
            // Print the content of the file
            System.out.println("File content:\n" + content);
        } catch (FileNotFoundException e) {
            // Catch FileNotFoundException if the file does not exist
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Catch IOException if an error occurs while reading the file
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    // Method to read the content of a file
    public static String readFile(String filename) throws IOException {
        // StringBuilder to store the content of the file
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            // Read each line from the file and append it to the StringBuilder
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        }
        // Return the content of the file as a string
        return contentBuilder.toString();
    }
}
/*Dry run
If the file "sample.txt" exists and can be read successfully:
File content:
[Content of the file]
If the file "sample.txt" does not exist:
File not found: sample.txt (or similar error message)
If there is an error while reading the file:
Error reading the file: [Error message]
/*
