package com.ncs.OOP.Constructor;

// ONLY CONSTRUCTOR EXAMPLE and here as shown below 
// if we provide an no argument constructor then compiler
// will not create an default constructor itself

public class NoArgConst {

	NoArgConst() {

		System.out.println("NO ARGUMENT CONSTRUCTOR");
	}

	public static void main(String[] args) {

		NoArgConst ng = new NoArgConst();
	}
}
