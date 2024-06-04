//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.
package exercise; // Define the package name

// Define a base class named Animal
class Animal {
// Method to print a message indicating that an animal moves
    public void move() {
        System.out.println("Animal moves");
    }
}

// Define a subclass named Cheetah that extends the Animal class
class Cheetah extends Animal {
  // Overriding the move method to print a message indicating that a cheetah runs
    @Override
    public void move() {
        System.out.println("Cheetah runs");
    }
}

// Define the main class with the main method
public class wildanimal {
    // Main method: Entry point of the program
    public static void main(String[] args) {
// Creating an instance of the Cheetah class
        Cheetah cheetah = new Cheetah();
        
// Calling the move method of the Cheetah instance
        cheetah.move();
    }
}
/*Dry run
Cheetah runs
/*

