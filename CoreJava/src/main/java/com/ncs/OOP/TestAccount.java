package com.ncs.OOP;

public class TestAccount {

	public static void main(String[] args) {
		// Create an instance of the Account class
		Account myAccount = new Account();

		// Set the initial balance
		myAccount.setBalance(3000);
		double InitialBalance = myAccount.getBalance();

		System.out.println("Initial Balance " + InitialBalance);

		myAccount.withdraw(100);

		myAccount.deposit(500);

		// Get the current balance
		double currentBalance = myAccount.getBalance();
		System.out.println("Current balance: " + currentBalance); // Current balance: 2500.0
	}

}
