package com.ncs.OOP.Polymorphism;

public class HomeLoan {

	public static void main(String[] args) {

		Bank[] banks = new Bank[3];
		banks[0] = new AxisBank();
		banks[1] = new ICICIBank();
		banks[2] = new HDFCBAnk();

		loanEnquiry(banks);
	}

	public static void loanEnquiry(Bank[] banks) {

		for (Bank b : banks) {

			String name = b.getName();
			double rate = b.interestRate();
			System.out.println(name + " " + rate);
		}

		/*
		 * System.out.println("******************");
		 * 
		 * Bank bank = new Bank(); Bank b = bank.getbank(1);
		 * System.out.println(b.getName()); System.out.println(b.interestRate());
		 */
	}

}
