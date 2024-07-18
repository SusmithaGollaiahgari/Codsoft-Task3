package org.susi.CodSoftTask3;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		 UserBank userAccount = new UserBank(1000.00); // Initial balance of $1000
	        ATM atm = new ATM(userAccount);
	        atm.displayMenu();
	}

	private UserBank account;

    public ATM(UserBank account) {
        this.account = account;
    }

    public void displayMenu() {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scan.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scan.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scan.close();
    }

    public void checkBalance() {
        System.out.println("Your current balance is: RS" + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}
