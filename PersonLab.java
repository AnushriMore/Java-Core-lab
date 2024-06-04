//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
package Labsecond;

public class PersonLab {
	 private String name;
	    private int age;
	    
	    // create Constructor
	    public PersonLab(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    
	    // create Getter method for name
	    public String getName() {
	        return name;
	    }
	    
	    // create Getter method for age
	    public int getAge() {
	        return age;
	    }
	    
	    public static void main(String[] args) {
	        // Creating two instances of Person
	        PersonLab person1 = new PersonLab("Yogada", 23);
	        PersonLab person2 = new PersonLab("Manasi", 22);
	        
	        // Printing name and age of person1
	        System.out.println("Person 1:");
	        System.out.println("Name: " + person1.getName());
	        System.out.println("Age: " + person1.getAge());
	        
	        System.out.println();
	        
	        // Printing name and age of person2
	        System.out.println("Person 2:");
	        System.out.println("Name: " + person2.getName());
	        System.out.println("Age: " + person2.getAge());
	    }
	}

/*Dry run
Person 1:
Name: Yogada
Age: 23

Person 2:
Name: Manasi
Age: 22
*/
