package com.ncs.OOP.This;

// Here this keyword is used to invoke the current class method
public class This2 {

	void display() {

		System.out.println("Display");
	}

	void show() {

		this.display();
		display(); // if we don't use the this keyword compiler will automatically
					// adds this keyword while invoking the method
	}

	public static void main(String[] args) {

		This2 th2 = new This2();

		th2.show();
	}
}
