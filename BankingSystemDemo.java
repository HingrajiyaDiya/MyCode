package MyPackage;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

// Task 1: Custom Exception Class (Indian Context)
class InsufficientFundsException extends Exception {
    private double currentBalance;
    private double requestedAmount;

    public InsufficientFundsException(String message, double currentBalance, double requestedAmount) {
        super(message);
        this.currentBalance = currentBalance;
        this.requestedAmount = requestedAmount;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}

// Task 2: Bank Account Class
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String branchLocation;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, String branchLocation, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.branchLocation = branchLocation;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public double getBalance() {
        return balance;
    }

    // Helper to format numbers in Indian Style (1,00,000)
    private String formatIndianCurrency(double amount) {
        // Use Locale for India (compatible with Java 7+)
        Locale indianLocale = Locale.forLanguageTag("en-IN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(indianLocale);
        formatter.setCurrency(java.util.Currency.getInstance("INR"));
        return formatter.format(amount);
    }

    public void performTransaction(double amount) throws InsufficientFundsException {
        if (amount > 0) {
            // Deposit
            balance += amount;
            System.out.println("✓ Deposit of " + formatIndianCurrency(amount) + " successful.");
            System.out.println("  New balance: " + formatIndianCurrency(balance));
        } else if (amount < 0) {
            // Withdrawal
            double withdrawalAmount = Math.abs(amount);
            if (withdrawalAmount > balance) {
                throw new InsufficientFundsException(
                    "Insufficient funds for withdrawal!",
                    balance,
                    withdrawalAmount
                );
            } else {
                balance -= withdrawalAmount;
                System.out.println("✓ Withdrawal of " + formatIndianCurrency(withdrawalAmount) + " successful.");
                System.out.println("  New balance: " + formatIndianCurrency(balance));
            }
        } else {
            System.out.println("⚠ Transaction amount must be non-zero.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("\n--- Account Information (Indian Bank) ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Branch Location: " + branchLocation);
        System.out.println("Current Balance: " + formatIndianCurrency(balance));
        System.out.println("------------------------------------------");
    }
}

// Task 3: Main Class to Demonstrate Usage
public class BankingSystemDemo {
    public static void main(String[] args) {
        System.out.println("=== Indian Banking System Simulation ===\n");

        // Creating accounts with Indian names and locations
        BankAccount account1 = new BankAccount("SBIN0001234", "Rajesh Kumar", "Mumbai, Maharashtra", 500000.00); // 5 Lakhs
        account1.displayAccountInfo();

        System.out.println("\n--- Performing Transactions ---\n");

        // Successful Deposit
        try {
            account1.performTransaction(150000.00); // 1.5 Lakhs
        } catch (InsufficientFundsException e) {
            System.out.println("✗ Error: " + e.getMessage());
        }

        // Successful Withdrawal
        try {
            account1.performTransaction(-50000.00); // 50k
        } catch (InsufficientFundsException e) {
            System.out.println("✗ Error: " + e.getMessage());
        }

        // Failed Withdrawal - Insufficient Funds
        System.out.println("\n--- Attempting Withdrawal Exceeding Balance ---\n");
        try {
            account1.performTransaction(-400000.00); // 4 Lakhs
        } catch (InsufficientFundsException e) {
            System.out.println("✗ Transaction Failed!");
            System.out.println("  Error: " + e.getMessage());
            System.out.println("  Current Balance: " + formatIndianCurrency(e.getCurrentBalance()));
            System.out.println("  Requested Amount: " + formatIndianCurrency(e.getRequestedAmount()));
            System.out.println("  Shortfall: " + formatIndianCurrency(e.getRequestedAmount() - e.getCurrentBalance()));
        }

        // Another Successful Transaction
        try {
            account1.performTransaction(-100000.00); // 1 Lakh
        } catch (InsufficientFundsException e) {
            System.out.println("✗ Error: " + e.getMessage());
        }

        // Display Final Account Info
        account1.displayAccountInfo();

        // Demonstrate Multiple Transactions with Rollback
        System.out.println("\n--- Testing Transaction Rollback (Second Account) ---\n");
        BankAccount account2 = new BankAccount("HDFC0005678", "Priya Sharma", "Bangalore, Karnataka", 200000.00); // 2 Lakhs
        account2.displayAccountInfo();

        try {
            System.out.println("Attempting to withdraw ₹3,00,000 (should fail)...");
            account2.performTransaction(-300000.00);
        } catch (InsufficientFundsException e) {
            System.out.println("✗ Transaction rolled back successfully.");
            System.out.println("  Balance remains unchanged: " + formatIndianCurrency(account2.getBalance()));
        }

        System.out.println("\n--- Final Account Info ---");
        account2.displayAccountInfo();
    }

    // Helper method for formatting in main for error messages
    private static String formatIndianCurrency(double amount) {
        Locale indianLocale = Locale.forLanguageTag("en-IN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(indianLocale);
        formatter.setCurrency(java.util.Currency.getInstance("INR"));
        return formatter.format(amount);
    }
}