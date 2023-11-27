package com.ncs.OOP.Constructor;

// Simple parameterized Constructor and if an class has only 
// parameterized  constructor then compiler will not create an 
// default constructor itself

public class ParameterizedConst {

	ParameterizedConst(int a) {

		System.out.println("Parameterized Constructor");
	}

	public static void main(String[] args) {

		ParameterizedConst ptc = new ParameterizedConst(90);
	}
}
