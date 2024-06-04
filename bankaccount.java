//Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
package exercise;

// BankAccount class representing a basic bank account
class BankAccount {
    // Instance variable to store the balance
    protected double balance;

    // Constructor to initialize the balance with given initialBalance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        // Check if withdrawal amount is less than or equal to balance
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// SavingsAccount class extending BankAccount
class SavingsAccount extends BankAccount {

    // Constructor to initialize SavingsAccount with initialBalance
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override withdraw method to add withdrawal limit
    @Override
    public void withdraw(double amount) {
        // Check if withdrawal amount is within limit and balance
        if (amount <= balance && amount <= 1000) {
            balance -= amount;
            System.out.println("Withdrawn from SavingsAccount: $" + amount);
        } else {
            System.out.println("Withdrawal amount exceeds limit or insufficient funds");
        }
    }
}

// CheckingAccount class extending BankAccount
class CheckingAccount extends BankAccount {

    // Constructor to initialize CheckingAccount with initialBalance
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    // Override withdraw method to include transaction fee
    @Override
    public void withdraw(double amount) {
        // Define transaction fee
        double fee = 1.5;
        // Check if withdrawal amount with fee is less than or equal to balance
        if (amount + fee <= balance) {
            balance -= (amount + fee);
            System.out.println("Withdrawn from CheckingAccount: $" + amount + " (including fee: $" + fee + ")");
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

// Main class containing the main method
public class bank {
    public static void main(String[] args) {
        // Create instances of SavingsAccount and CheckingAccount
        SavingsAccount savingsAccount = new SavingsAccount(2500);
        CheckingAccount checkingAccount = new CheckingAccount(1600);

// Print initial balances
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());

        // Perform transactions
        savingsAccount.deposit(500);
        savingsAccount.withdraw(600);
        checkingAccount.deposit(500);
        checkingAccount.withdraw(400);

// Print balances after transactions
        System.out.println("Savings Account Balance after transactions: $" + savingsAccount.getBalance());
        System.out.println("Checking Account Balance after transactions: $" + checkingAccount.getBalance());
    }
}

/*Dry run
Savings Account Balance: $2500.0
Checking Account Balance: $1600.0
Deposited: $500.0
Withdrawn from SavingsAccount: $600.0
Deposited: $500.0
Withdrawn from CheckingAccount: $400.0 (including fee: $1.5)
Savings Account Balance after transactions: $2400.0
Checking Account Balance after transactions: $1698.5
/*
