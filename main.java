
class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Please enter a valid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Please enter a valid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs. " + balance);
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class Main {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount(101, "Rahul", 5000.0);
        BankAccount account2 = new BankAccount(102, "Priya", 8000.0);

        System.out.println("----- Account 1 -----");
        account1.deposit(2000.0);
        account1.withdraw(1500.0);
        account1.checkBalance();
        account1.displayDetails();

        System.out.println();

        System.out.println("----- Account 2 -----");
        account2.deposit(1000.0);
        account2.withdraw(2500.0);
        account2.checkBalance();
        account2.displayDetails();
    }
}
