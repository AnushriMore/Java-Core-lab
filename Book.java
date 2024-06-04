//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
package Labsecond;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    
    //create a Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    
    // Get method for title
    public String getTitle() {
        return title;
    }
    
    // Get method for author
    public String getAuthor() {
        return author;
    }
    
    // Get method for ISBN
    public String getISBN() {
        return ISBN;
    }
    
    // Method to add a book to a collection
    public static void addBook(List<Book> collection, Book book) {
        collection.add(book);
        System.out.println("Book added to collection: " + book.getTitle());
    }
    
    // Method to remove a book from a collection
    public static void removeBook(List<Book> collection, String ISBN) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getISBN().equals(ISBN)) {
                System.out.println("Book removed from collection: " + collection.get(i).getTitle());
                collection.remove(i);
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found in the collection.");
    }
    
    public static void main(String[] args) {
        // Creating a collection of books
        List<Book> collection = new ArrayList<>();
        
        // Adding books to the collection
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        addBook(collection, book1);
        addBook(collection, book2);
        
        // Removing a book from the collection
        removeBook(collection, "9780743273565");
        
        // Displaying the remaining books in the collection
        System.out.println("\nRemaining books in the collection:");
        for (Book book : collection) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}
/*Dry run
Book added to collection: The Great Gatsby
Book added to collection: To Kill a Mockingbird
Book removed from collection: The Great Gatsby

Remaining books in the collection:
Title: To Kill a Mockingbird, Author: Harper Lee, ISBN: 9780061120084
/*
