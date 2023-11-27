package com.ncs.OOP.This;

// Here this keyword is used to call the current class constructor
public class This3 {

	This3() {

		System.out.println("This is No argument Constructor");
	}

	This3(int z) {

		this();
		System.out.println("This is Parameterized Constructor");
	}

	public static void main(String[] args) {

		This3 th3 = new This3(10);
	}
}
