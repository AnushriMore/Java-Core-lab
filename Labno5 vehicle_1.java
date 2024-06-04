//Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.
// Define an abstract class named Vehicle
abstract class Vehicle {
    // Abstract methods to start and stop the engine
    public abstract void startEngine();
    public abstract void stopEngine();
}

// Define a subclass named Car that extends the Vehicle class
class Car extends Vehicle {
// Implementing the startEngine method for the Car subclass
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

// Implementing the stopEngine method for the Car subclass
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }
}

// Define a subclass named Motorcycle that extends the Vehicle class
class Motorcycle extends Vehicle {
    // Implementing the startEngine method for the Motorcycle subclass
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

// Implementing the stopEngine method for the Motorcycle subclass
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}

// Main class to test the program
public class Labno5_1 {
    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Creating instances of Car and Motorcycle
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
 // Starting and stopping engines of the Car and Motorcycle
        car.startEngine();
        car.stopEngine();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

/*Dry run
Car engine started
Car engine stopped
Motorcycle engine started
Motorcycle engine stopped
/*


