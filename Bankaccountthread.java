// Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads.
package Anudipjavalab;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankaccountthread {
    // The balance of the bank account
    private double balance;
    // Lock object for synchronization
    private Lock lock;

    // Constructor to initialize balance and lock
    public Bankaccountthread() {
        balance = 0.0;
        lock = new ReentrantLock();
    }

    // Method to deposit an amount into the bank account
    public void deposit(double amount) {
        lock.lock(); // Acquire the lock
        try {
            balance += amount; // Add the amount to the balance
            System.out.println("Deposit: " + amount);
            System.out.println("Balance after deposit: " + balance);
        } finally {
            lock.unlock(); // Release the lock
        }
    }

    // Method to withdraw an amount from the bank account
    public void withdraw(double amount) {
        lock.lock(); // Acquire the lock
        try {
            if (balance >= amount) { // Check if there are sufficient funds
                balance -= amount; // Subtract the amount from the balance
                System.out.println("Withdrawal: " + amount);
                System.out.println("Balance after withdrawal: " + balance);
            } else {
                System.out.println("Try to Withdraw: " + amount);
                System.out.println("Insufficient funds. Withdrawal cancelled.");
            }
        } finally {
            lock.unlock(); // Release the lock
        }
    }

    public static void main(String[] args) {
        // Create a bank account instance
        Bankaccountthread account = new Bankaccountthread();

        // Create threads for deposit and withdrawal operations
        Thread depositThread1 = new Thread(() -> account.deposit(1000));
        Thread depositThread2 = new Thread(() -> account.deposit(300));
        Thread withdrawalThread1 = new Thread(() -> account.withdraw(150));
        Thread withdrawalThread2 = new Thread(() -> account.withdraw(1200));

        // Start the threads
        depositThread1.start();
        depositThread2.start();
        withdrawalThread1.start();
        withdrawalThread2.start();
    }
}

/*Dry run
Deposit: 1000.0
Balance after deposit: 1000.0
Deposit: 300.0
Balance after deposit: 1300.0
Withdrawal: 150.0
Balance after withdrawal: 1150.0
Try to Withdraw: 1200.0
Insufficient funds. Withdrawal cancelled.
/*
