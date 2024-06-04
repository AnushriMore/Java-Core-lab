// Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
// Define an abstract class named BankAccount
abstract class BankAccount {
    // Protected attribute to store balance
    protected double balance;

    // Abstract methods to be implemented by subclasses
    public abstract void deposit(double amount); // Method to deposit money into the account
    public abstract void withdraw(double amount); // Method to withdraw money from the account

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Subclass SavingsAccount extending BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor initializing interest rate and balance
    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
        this.balance = 0.0;
    }

    // Implementing abstract methods
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to add interest to the account balance
    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Added interest: " + interest);
    }
}

// Subclass CurrentAccount extending BankAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor initializing overdraft limit and balance
    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
        this.balance = 0.0;
    }

    // Implementing abstract methods
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw. Exceeds overdraft limit.");
        }
    }

    // Method to set overdraft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

// Main class to test the program
public class Lab5_3 {
    public static void main(String[] args) {
       
 // Create instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount(2.5); 
        CurrentAccount currentAccount = new CurrentAccount(500); 

        // Deposit, add interest, and withdraw from SavingsAccount
        savingsAccount.deposit(1000);
        savingsAccount.addInterest();
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        savingsAccount.withdraw(200);
        System.out.println("Savings Account Balance after withdrawal: " + savingsAccount.getBalance());

        System.out.println();

 // Deposit and withdraw from CurrentAccount
        currentAccount.deposit(800);
        System.out.println("Current Account Balance:" + currentAccount.getBalance());
        currentAccount.withdraw(400);
        System.out.println("Current Account Balance after withdrawal:" + currentAccount.getBalance());
        currentAccount.withdraw(1000); 
        System.out.println("Current Account Balance after attempted withdrawal:" + currentAccount.getBalance());
    }
}

/*Dry run
Deposited: 1000.0
Added interest: 25.0
Savings Account Balance: 1025.0
Withdrawn: 200.0
Savings Account Balance after withdrawal: 825.0

Deposited: 800.0
Current Account Balance:800.0
Withdrawn: 400.0
Current Account Balance after withdrawal:400.0
Cannot withdraw. Exceeds overdraft limit.
Current Account Balance after attempted withdrawal:400.0
/*
