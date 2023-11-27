package com.ncs.OOP.This;

// Here this keyword is used to Pass as an argument in the method calling
public class This4 {

	void FirstMethod(This4 th4) {

		System.out.println("Passing this keyword as an method argument");
	}

	void SecondMethod() {

		FirstMethod(this);
	}

	public static void main(String[] args) {

		This4 th4 = new This4();
		th4.SecondMethod();
	}

}
