package com.ncs.OOP.Shallow.Deep.Combine;

public class DeCustomer implements Cloneable {

	public String name = null;;
	public DeAccount accBalance = null;

	public DeCustomer() {

	}

	DeCustomer(String name, int amount) {

		this.name = name;
		this.accBalance = new DeAccount(amount);
	}

	public String getName() {
		return name;
	}

	public Object clone() throws CloneNotSupportedException {
		DeCustomer dc = (DeCustomer) super.clone();
		dc.accBalance = (DeAccount) accBalance.clone();
		return dc;
	}
}
