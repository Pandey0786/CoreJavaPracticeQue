package com.ncs.OOP.ShallowCloning;

public class TestAccountClass {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account a1 = new Account(100);
		Account a2 = (Account) a1.clone();

		// a2.setBalance(200);
		// a1.setBalance(150);

		// a1.name = "Sagar";
		// a2.name = "Shashank";

		a2.balance = 200;
		
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
//		System.out.println(a1.getName());
//		System.out.println(a2.getName());
	}
}
