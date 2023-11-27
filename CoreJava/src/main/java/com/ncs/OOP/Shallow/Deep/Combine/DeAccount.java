package com.ncs.OOP.Shallow.Deep.Combine;

public class DeAccount implements Cloneable {

	public int balance;

	DeAccount() {
	}

	public DeAccount(int balance) {
		this.balance = balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
