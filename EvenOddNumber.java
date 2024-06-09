//Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
package Anudipjavalab;

public class EvenOddNumber {
    // The maximum number to be printed by the threads
    private static final int MAX_NUMBER = 20;
    // Lock object for synchronization
    private static final Object lock = new Object();
    // Boolean flag to indicate whose turn it is to print
    private static boolean isEvenTurn = true;

    public static void main(String[] args) {
        // Creating a thread for printing even numbers
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= MAX_NUMBER; i += 2) {
                synchronized(lock) {
                    // Wait if it's not the even thread's turn
                    while (!isEvenTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Print the even number
                    System.out.println("Even Number from evenThread: " + i);
                    // Change the turn to odd thread
                    isEvenTurn = false;
                    // Notify the odd thread
                    lock.notify();
                }
            }
        });

        // Creating a thread for printing odd numbers
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= MAX_NUMBER; i += 2) {
                synchronized(lock) {
                    // Wait if it's not the odd thread's turn
                    while (isEvenTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Print the odd number
                    System.out.println("Odd Number from oddThread: " + i);
                    // Change the turn to even thread
                    isEvenTurn = true;
                    // Notify the even thread
                    lock.notify();
                }
            }
        });

        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}
/*Dry Run
Even Number from evenThread: 2
Odd Number from oddThread: 1
Even Number from evenThread: 4
Odd Number from oddThread: 3
Even Number from evenThread: 6
Odd Number from oddThread: 5
Even Number from evenThread: 8
Odd Number from oddThread: 7
Even Number from evenThread: 10
Odd Number from oddThread: 9
Even Number from evenThread: 12
Odd Number from oddThread: 11
Even Number from evenThread: 14
Odd Number from oddThread: 13
Even Number from evenThread: 16
Odd Number from oddThread: 15
Even Number from evenThread: 18
Odd Number from oddThread: 17
Even Number from evenThread: 20
Odd Number from oddThread: 19
/*
