package com.ncs.OOP;

public class Account {
	private double balance;

	// Setter for balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Getter for balance
	public double getBalance() {
		return balance;
	}

	// Method to withdraw from the account
	public void withdraw(double amount) {
		if (balance >= 2000) {
			balance -= amount;
			System.out.println("Withdrawal Current balance: " + balance);
		} else {
			System.out.println("Insufficient balance for withdrawal.");
		}
	}

	// Method to deposit into the account
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful. Current balance: " + balance);
	}
}
