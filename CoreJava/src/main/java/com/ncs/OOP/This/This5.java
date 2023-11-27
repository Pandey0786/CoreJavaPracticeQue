package com.ncs.OOP.This;

//Here this keyword is used to pass as an argument in the constructor call
public class This5 {

	void Method1() {

		ConstructorForThis5 cfth5 = new ConstructorForThis5(this);
	}

	public static void main(String[] args) {

		This5 th5 = new This5();

		th5.Method1();
	}
}
