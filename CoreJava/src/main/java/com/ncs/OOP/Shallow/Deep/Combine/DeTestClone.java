package com.ncs.OOP.Shallow.Deep.Combine;

public class DeTestClone {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Below Shallow Cloning Example

		DeAccount a1 = new DeAccount();
		DeAccount a2 = (DeAccount) a1.clone();

		a1.setBalance(100);
		a2.setBalance(150);

		System.out.println("a1 Bal : " + a1.getBalance());
		System.out.println("a2 Bal : " + a2.getBalance());

		System.out.println();

		// Below Deep Cloning Example

		DeCustomer a3 = new DeCustomer("Adesh", 1000);
		DeCustomer a4 = (DeCustomer) a3.clone();

		a4.accBalance.balance = 2000;
		a4.name = "Shekhar";

		System.out.println("a3 Bal : " + a3.getName());
		System.out.println("a3 Bal : " + a3.accBalance.getBalance());
		System.out.println("a3 Bal : " + a4.getName());
		System.out.println("a4 Bal : " + a4.accBalance.getBalance());
	}

}
