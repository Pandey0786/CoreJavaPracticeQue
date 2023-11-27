package com.ncs.OOP.Polymorphism;

public class Bank {

	public double interestRate() {

		return 9.0;

	}

	public String getName() {

		return "RBI BANK";
	}

	public Bank getbank(int i) {

		if (i == 0) {

			return new AxisBank();

		}

		if (i == 1) {

			return new HDFCBAnk();

		}

		if (i == 2) {

			return new ICICIBank();
		}
		return null;

	}
}
