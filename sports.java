//Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass to play a specific statement for each sport.
// Define a superclass Sports representing a generic sports activity
class Sports {
    // Method to play generic sports
    public void play() {
        System.out.println("Playing generic sports");
    }
}

// Define a subclass Football inheriting from Sports
class Football extends Sports {
    // Override the play method to specify playing football
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

// Define a subclass Basketball inheriting from Sports
class Basketball extends Sports {
    // Override the play method to specify playing basketball
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

// Define a subclass Rugby inheriting from Sports
class Rugby extends Sports {
    // Override the play method to specify playing rugby
    @Override
    public void play() {
        System.out.println("Playing rugby");
    }
}

// Main class to demonstrate polymorphism
public class sport {
public static void main(String[] args) {
// Create objects of each subclass
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();
        
// Call the play method on each object, demonstrating polymorphism
        football.play();    // Calls overridden play method of Football class
        basketball.play();  // Calls overridden play method of Basketball class
        rugby.play();       // Calls overridden play method of Rugby class
    }
}
/*Dry run
Playing football
Playing basketball
Playing rugby
/*
