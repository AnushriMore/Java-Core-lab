//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
package exercise; // Define the package name

// Define a base class named Animal
class Animal { 
// Method to print a message indicating that an animal makes a sound
    public void makeSound() 
    {
        System.out.println("Animal makes a sound");
    }
}

// Define a subclass named Cat that extends the Animal class
class Cat extends Animal 
{
    // Overriding the makeSound method to print a message indicating that a cat barks
    @Override
    public void makeSound() 
    {
        System.out.println("Cat barks");
    }
}

// Define the main class with the main method
public class howcatbarks {
    // Main method: Entry point of the program
    public static void main(String[] args) {
    // Creating an instance of the Cat class
        Cat cat = new Cat();
        
        // Calling the makeSound method of the Cat instance
        cat.makeSound();
    }
}
/*Dry run
Cat barks
/*
