import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {

        private int accountNumber;
        private double balance;
        private Customer owner;

        public BankAccount(int accountNumber, Customer owner) {
            this.accountNumber = accountNumber;
            this.owner = owner;
            this.balance = 0.0;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public Customer getOwner() {
            return owner;
        }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}



