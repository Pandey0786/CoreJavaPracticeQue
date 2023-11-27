package com.ncs.OOP.Encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account();

		a.setNumber("234567890");
		a.setAccountType("SBI");
		a.setBalance(500000);
		System.out.println(a.getNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getBalance());

		a.deposite(600);
		System.out.println("after deposite = " + a.getBalance());

		a.withdrawl(1000);
		System.out.println("after withdrawl =" + a.getBalance());

		a.paybill(500);
		System.out.println("after paybill = " + a.getBalance());

		a.fundtransfer(900);
		System.out.println("after fundtransfer = " + a.getBalance());

		System.out.println("present balance = " + a.getBalance());
	}

}
