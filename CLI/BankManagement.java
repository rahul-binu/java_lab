import java.util.Scanner;

// Base class Account
class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    // Constructor
    public Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to accept deposit
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Method to compute interest (to be overridden by derived classes)
    void computeInterest() {
        // Default implementation (to be overridden)
    }

    // Method to permit withdrawal (to be overridden by derived classes)
    void withdraw(double amount) {
        // Default implementation (to be overridden)
    }
}

// Derived class CurrAcct
class CurrAcct extends Account {
    double minBalance;

    // Constructor
    public CurrAcct(String customerName, int accountNumber, double balance, double minBalance) {
        super(customerName, accountNumber, "Current", balance);
        this.minBalance = minBalance;
    }

    // Overridden method to permit withdrawal
    @Override
    void withdraw(double amount) {
        if (balance - amount < minBalance) {
            System.out.println("Insufficient funds. Minimum balance requirement not met.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        }
    }
}

// Derived class SavAcct
class SavAcct extends Account {
    double interestRate;

    // Constructor
    public SavAcct(String customerName, int accountNumber, double balance, double interestRate) {
        super(customerName, accountNumber, "Savings", balance);
        this.interestRate = interestRate;
    }

    // Overridden method to compute interest
    @Override
    void computeInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of " + interest + " added.");
    }
}

// Main class
public class BankManagement {
    public static void main(String[] args) {
        // Create a savings account
        SavAcct savingsAccount = new SavAcct("John Doe", 123456, 5000, 5);

        // Deposit in savings account
        savingsAccount.deposit(1000);

        // Display balance
        savingsAccount.displayBalance();

        // Compute interest for savings account
        savingsAccount.computeInterest();

        // Display balance after interest
        savingsAccount.displayBalance();

        // Create a current account
        CurrAcct currentAccount = new CurrAcct("Jane Doe", 654321, 8000, 1000);

        // Withdraw from current account
        currentAccount.withdraw(500);

        // Display balance after withdrawal
        currentAccount.displayBalance();
    }
}
