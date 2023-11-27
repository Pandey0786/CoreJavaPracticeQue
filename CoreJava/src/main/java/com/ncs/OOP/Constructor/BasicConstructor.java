package com.ncs.OOP.Constructor;

// Here By default compiler will create default constructor
// and initialize the value of variables 
public class BasicConstructor {

	int i;
	String s;

	public static void main(String[] args) {

		BasicConstructor bc = new BasicConstructor();

		System.out.println(bc.i + " " + bc.s);
	}

}
