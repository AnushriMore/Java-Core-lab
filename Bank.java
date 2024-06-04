//Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
import java.util.ArrayList;
import java.util.List;

// Interface defining common account operations
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void cal_Interest(); // For savings account only
    double getBalance();
}

// Implementation of Savings Account
class Svg_Acc implements Account {
    private double balance;
    private double interestRate;

    public Svg_Acc(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public void cal_Interest() {
        balance += balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Implementation of Current Account
class Cur_Acc implements Account {
    private double balance;
    private double overdraftLimit;

    public Cur_Acc(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal. Transaction exceeds overdraft limit.");
        }
    }

    @Override
    public void cal_Interest() {
        // Not applicable for current accounts
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Bank class to manage accounts
class Bank {
    private final List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

// Main class
public class Labno5_5 {
    public static void main(String[] args) {
        // Creating a bank
        Bank bank = new Bank();

        // Adding accounts to the bank
        bank.addAccount(new Svg_Acc(1000, 0.05)); // Savings Account
        bank.addAccount(new Cur_Acc(500, 1000)); // Current Account

        // Simulating transactions
        bank.getAccounts().get(0).deposit(500);
        bank.getAccounts().get(0).withdraw(200);
        ((SavingsAccount) bank.getAccounts().get(0)).cal_Interest(); // Casting to access specific method

        bank.getAccounts().get(1).deposit(100);
        bank.getAccounts().get(1).withdraw(800);

        // Printing account balances
        for (Account account : bank.getAccounts()) {
            System.out.println("Balance: $" + account.getBalance());
        }
    }
}
/*Dry run
Insufficient funds for withdrawal.
Insufficient funds for withdrawal. Transaction exceeds overdraft limit.
Balance: $1500.0
Balance: $-800.0
/*
