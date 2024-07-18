package org.susi.CodSoftTask3;

public class UserBank {
	private double balance;

    public UserBank(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive number.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdraw RS" + amount);
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive number and ensure you have sufficient balance.");
        }
    }
}
