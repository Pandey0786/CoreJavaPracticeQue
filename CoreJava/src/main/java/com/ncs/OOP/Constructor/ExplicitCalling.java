package com.ncs.OOP.Constructor;

public class ExplicitCalling extends ImpicitConstructorCalling {

	public String a;
	public String b;

	public ExplicitCalling() {

		super();
	}

	public ExplicitCalling(String a, String b) {

		super(a, b);
	}

	public static void main(String[] args) {

		ExplicitCalling exp = new ExplicitCalling();
	}
}
