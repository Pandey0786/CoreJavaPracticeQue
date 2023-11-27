package com.ncs.OOP.SuperKeyword;

// Here super Keyword used to invoke parent class Constructor
public class Z1 extends Z {

	Z1() {

		super();
		System.out.println("Testing Constructor Calling Using Super DONE");
	}

	public static void main(String[] args) {

		Z1 z1 = new Z1();
	}
}
